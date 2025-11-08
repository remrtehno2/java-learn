package percolation;

import java.util.Random;

public class PercolationStats {
    private final double[] allResultPercolation;
    // perform independent trials on an n-by-n grid
    private final int trials;

    public PercolationStats(int n, int trials) {
        if (n <= 0 || trials <= 0) {
            throw new IllegalArgumentException("index is not between 0 and ");
        }

        allResultPercolation = new double[trials];
        this.trials = trials;


        for (int i = 0; i < trials; i++) {
            Percolation percolation = new Percolation(n);

            Random random = new Random();

            while (!percolation.percolates()) {
                int randomRow = random.nextInt(0, percolation.sizeGrid);
                int randomCol = random.nextInt(0, percolation.sizeGrid);

                percolation.open(randomRow, randomCol);
            }

            var t = (double) percolation.sizeGrid * (double) percolation.sizeGrid;
            double tr = (double) percolation.openedSites / t;
            allResultPercolation[i] = tr;

        }
    }

    // test client (see below)
    public static void main(String[] args) {
//        int n = Integer.parseInt(args[0]);
//        int T = Integer.parseInt(args[1]);

        PercolationStats percolationStats = new PercolationStats(100, 100);
        System.out.println("Mean: " + percolationStats.mean());
        System.out.println("Standard Deviation: " + percolationStats.stddev());
        System.out.println("95% Confidence Interval: [" + percolationStats.confidenceLo() + ", " + percolationStats.confidenceHi() + "]");
    }

    // sample mean of percolation threshold
    public double mean() {
        double result = 0;


        for (var l : allResultPercolation) {
            result += l;
        }


        return result / trials;
    }

    // sample standard deviation of percolation threshold
    public double stddev() {
        double mean = mean();
        double sum = 0.0;
        for (double result : allResultPercolation) {
            sum += Math.pow(result - mean, 2);
        }
        return Math.sqrt(sum / (trials - 1));
    }

    // Low endpoint of 95% confidence interval
    public double confidenceLo() {
        return mean() - (1.96 * stddev() / Math.sqrt(trials));
    }

    // High endpoint of 95% confidence interval
    public double confidenceHi() {
        return mean() + (1.96 * stddev() / Math.sqrt(trials));
    }
}
