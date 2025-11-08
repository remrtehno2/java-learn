import edu.princeton.cs.algs4.WeightedQuickUnionUF;

public class ChatGPTPercolcation {
}

class Percolation {
    private int n;
    private boolean[][] grid;
    private WeightedQuickUnionUF uf;
    private int virtualTop;
    private int virtualBottom;

    public Percolation(int n) {
        this.n = n;
        grid = new boolean[n][n];
        uf = new WeightedQuickUnionUF(n * n + 2);
        virtualTop = n * n;
        virtualBottom = n * n + 1;

        // Connect the top row to the virtual top node
        for (int col = 0; col < n; col++) {
            uf.union(virtualTop, xyTo1D(0, col));
        }

        // Connect the bottom row to the virtual bottom node
        for (int col = 0; col < n; col++) {
            uf.union(virtualBottom, xyTo1D(n - 1, col));
        }
    }

    // Convert 2D (row, col) coordinates to 1D index
    private int xyTo1D(int row, int col) {
        return row * n + col;
    }

    // Open a site (row, col) and connect it to adjacent open sites
    public void open(int row, int col) {
        grid[row][col] = true;
        int index = xyTo1D(row, col);

        // Connect to adjacent open sites
        if (row > 0 && grid[row - 1][col]) {
            uf.union(index, xyTo1D(row - 1, col)); // Connect to top
        }
        if (row < n - 1 && grid[row + 1][col]) {
            uf.union(index, xyTo1D(row + 1, col)); // Connect to bottom
        }
        if (col > 0 && grid[row][col - 1]) {
            uf.union(index, xyTo1D(row, col - 1)); // Connect to left
        }
        if (col < n - 1 && grid[row][col + 1]) {
            uf.union(index, xyTo1D(row, col + 1)); // Connect to right
        }
    }

    // Check if the system percolates
    public boolean percolates() {
        System.out.printf("%d - %d \n", virtualTop, virtualBottom);
        return uf.connected(virtualTop, virtualBottom);
    }

    public static void main(String[] args) {
        int n = 4;
        Percolation perc = new Percolation(n);

        // Example to open sites and check for percolation
        perc.open(0, 1); // Open (0, 1)
        perc.open(1, 1); // Open (1, 1)
        perc.open(2, 1); // Open (2, 1)
        perc.open(3, 1); // Open (3, 1)

        System.out.println(perc.xyTo1D(0,3));


        // Check if the system percolates
        System.out.println("Does the system percolate? " + perc.percolates()); // Should print true
    }
}
