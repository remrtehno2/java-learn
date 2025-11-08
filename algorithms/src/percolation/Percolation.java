package percolation;
import edu.princeton.cs.algs4.WeightedQuickUnionUF;
import java.util.Random;

// C:\Program Files\Eclipse Adoptium\jdk-11.0.20.8-hotspot\bin
public class Percolation {
    public final boolean[][] grid;
    public final WeightedQuickUnionUF weightedQuickUnionUF;
    public final int virtualTop;
    public final int virtualBottom;
    public int sizeGrid;
    public int openedSites = 0;

    // creates n-by-n grid, with all sites initially blocked
    public Percolation(int n) {
        weightedQuickUnionUF = new WeightedQuickUnionUF(n + 2);
        grid = new boolean[(int) Math.sqrt(n)][(int) Math.sqrt(n)];
        sizeGrid = (int) Math.sqrt(n);


        virtualTop = n; // n ends on 16 but index start from 0
        virtualBottom = n + 1; // + 1 because virtual items are already increased by 1 naturally
        //connect top and bottom
        for (int i = 1; i <= sizeGrid; i++) {
            weightedQuickUnionUF.union(virtualTop, i);
            weightedQuickUnionUF.union(virtualBottom, n - i);
        }

    }

    // test client (optional)
    public static void main(String[] args) {
        Percolation percolation = new Percolation(400);

        Random random = new Random();

        while (!percolation.percolates()) {
            int randomRow = random.nextInt(0, percolation.sizeGrid);
            int randomCol = random.nextInt(0, percolation.sizeGrid);

            percolation.open(randomRow, randomCol);
        }

        System.out.println(percolation.percolates());
        double percolationThreshold = (double) percolation.numberOfOpenSites() / ((double) percolation.sizeGrid * (double) percolation.sizeGrid);


        System.out.printf("""
                \n
                Size: %d
                Threshold: %.2f
                Opened sites: %d
                """, percolation.sizeGrid, percolationThreshold, percolation.numberOfOpenSites()

        );
    }

    private int xyTo1D(int row, int col) {
        return row * sizeGrid + col;
    }

    // opens the site (row, col) if it is not open already
    public void open(int row, int col) {

        if (grid[row][col]) {
            openedSites++;
        }
        grid[row][col] = true;


        if (row > 0 && grid[row - 1][col]) {
            weightedQuickUnionUF.union(xyTo1D(row - 1, col), xyTo1D(row, col));
        }

        // bottom
        if (row < sizeGrid - 1 && grid[row + 1][col]) {
            weightedQuickUnionUF.union(xyTo1D(row + 1, col), xyTo1D(row, col));
        }

        // left
        if (col > 0 && grid[row][col - 1]) {
            weightedQuickUnionUF.union(xyTo1D(row, col - 1), xyTo1D(row, col));
        }

        // bottom
        if (col > sizeGrid - 1 && grid[row][col + 1]) {
            weightedQuickUnionUF.union(xyTo1D(row, col + 1), xyTo1D(row, col));
        }

//        System.out.println(Arrays.deepToString(grid));

//        System.out.println("Is opened: " + weightedQuickUnionUF.connected(xyTo1D(1, 1), xyTo1D(3, 2)));
//        System.out.println("Percolates?: " + percolates());
    }

    // is the site (row, col) open?
    public boolean isOpen(int row, int col) {
        return grid[row][col];
    }

    // is the site (row, col) full?
    public boolean isFull(int row, int col) {
        return weightedQuickUnionUF.connected(xyTo1D(row, col), virtualTop);
    }

    // returns the number of open sites
    public int numberOfOpenSites() {
        return openedSites;
    }

    // does the system percolate?
    public boolean percolates() {
        return weightedQuickUnionUF.connected(virtualTop, virtualBottom);
    }
}
