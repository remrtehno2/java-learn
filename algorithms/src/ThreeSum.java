public class ThreeSum {
    public static int count(int[] a) { // Count triples that sum to 0.
        int ifexecuted = 0;
        int N = a.length;
        int cnt = 0;
        for (int i = 0; i < N; i++)
            for (int j = i + 1; j < N; j++)
                for (int k = j + 1; k < N; k++) {
                    ifexecuted++;
                    if (a[i] + a[j] + a[k] == 0) cnt++;
                }

        System.out.println(ifexecuted);
        return cnt;
    }

    public static void main(String[] args) {

        StdOut.println(count(new int[]{1, 2, 3, 4, 5}));
    }
}
