public class QuickUnionUF {
    private final int[] id;

    public QuickUnionUF(int N) {
        id = new int[N];
        for (int i = 0; i < N; i++) id[i] = i;
    }

    public static void main(String[] args) {
        int y = 16;
        QuickUnionUF QuickUnionUF = new QuickUnionUF(y);


        QuickUnionUF.union(12, 8);
        QuickUnionUF.union(8, 4);
        QuickUnionUF.union(4, 5);
        QuickUnionUF.union(5, 1);

        System.out.println("Is connected?: " + QuickUnionUF.connected(1, 12));

        for (int i = 0; i < y; i++) {
            boolean splitNewLine = (i + 1) % 4 == 0;

            System.out.printf(" %d ", QuickUnionUF.getId()[i]);

            if (splitNewLine) {
                System.out.println();
            }
        }
    }

    private int root(int i) {
        while (i != id[i]) i = id[i];
        return i;
    }

    public boolean connected(int p, int q) {
        return root(p) == root(q);
    }

    public void union(int p, int q) {
        int i = root(p);
        int j = root(q);
        id[i] = j;
    }

    public int[] getId() {
        return id;
    }
}