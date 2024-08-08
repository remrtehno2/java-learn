package percolation;

import java.util.Arrays;

public class Percolation {
    private final boolean[][] grid;

    // creates n-by-n grid, with all sites initially blocked
    public Percolation(int n) {
        grid = new boolean[n][n];
    }

    // test client (optional)
    public static void main(String[] args) {
        var t = new Percolation(4);

        t.open(0, 1);
        t.open(1, 1);
        t.open(1, 0);
        t.open(2, 0);
        t.open(3, 0);

        t.printGrid();
    }

    // opens the site (row, col) if it is not open already
    public void open(int row, int col) {
        grid[row][col] = true;
    }

    // is the site (row, col) open?
    public boolean isOpen(int row, int col) {
        return grid[row][col];
    }

    // is the site (row, col) full?
    public boolean isFull(int row, int col) {
        return false;
    }

    // returns the number of open sites
    public int numberOfOpenSites() {
        return 0;
    }

    // does the system percolate?
    public boolean percolates() {
        return false;
    }

    public void printGrid() {
        for (boolean[] y : grid) {
            System.out.println(
                    Arrays.toString(y)
            );
        }
    }
}
