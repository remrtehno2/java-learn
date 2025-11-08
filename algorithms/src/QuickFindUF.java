public class QuickFindUF {
    private final int[] id;

    public QuickFindUF(int N) {
        id = new int[N];
        for (int i = 0; i < N; i++)
            id[i] = i;
    }

    public static void main(String[] args) {
        // QUICK FIND
        int y = 16;
        QuickFindUF quickFindUF = new QuickFindUF(y);


        quickFindUF.union(12, 8);
        quickFindUF.union(8, 4);
        quickFindUF.union(4, 5);
        quickFindUF.union(5, 1);

        for (int i = 0; i < y; i++) {
            boolean splitNewLine = (i + 1) % 4 == 0;

            System.out.printf(" %d ", quickFindUF.getId()[i]);

            if (splitNewLine) {
                System.out.println();
            }
        }
    }

    public boolean connected(int p, int q) {
        return id[p] == id[q];
    }

    public void union(int p, int q) {
        int pid = id[p];
        int qid = id[q];
        for (int i = 0; i < id.length; i++)
            if (id[i] == pid) id[i] = qid;
    }

    public int[] getId() {
        return id;
    }
}

