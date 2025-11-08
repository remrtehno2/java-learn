import edu.princeton.cs.algs4.CollisionSystem;
import edu.princeton.cs.algs4.Particle;
import edu.princeton.cs.algs4.StdDraw;

import java.util.Arrays;

public class MainSedgewick {
    public static void main(String[] args) {
//        int n = 20;  // number of particles (default 20)
//        if (args.length == 1) {
//            n = Integer.parseInt(args[0]);
//        }
//
//        // enable double buffering to support animations
//        StdDraw.enableDoubleBuffering();
//
//        // create the n particles
//        Particle[] particles = new Particle[n];
//        for (int i = 0; i < n; i++) {
//            particles[i] = new Particle();
//        }
//
//        // simulate the system
//        CollisionSystem system = new CollisionSystem(particles);
//        system.simulate(Double.POSITIVE_INFINITY);


        System.out.println(merge("D C E".split(" "), 0, 1, 2));
    }


    private static Comparable[] aux; // auxiliary array for merges
    public static void sort(Comparable[] a)
    {
        aux = new Comparable[a.length]; // Allocate space just once.
        sort(a, 0, a.length - 1);
    }
    private static void sort(Comparable[] a, int lo, int hi)
    { // Sort a[lo..hi].
        if (hi <= lo) return;
        int mid = lo + (hi - lo)/2;
        sort(a, lo, mid); // Sort left half.
        sort(a, mid+1, hi); // Sort right half.
        merge(a, lo, mid, hi); // Merge results (code on page 271).
    }

    public static String merge(Comparable[] a, int lo, int mid, int hi) {
        // Merge a[lo..mid] with a[mid+1..hi].
        int i = lo, j = mid + 1;

        // Copy a[lo..hi] to aux[lo..hi].
        Comparable[] aux = new Comparable[hi - lo + 1];

        for (int k = lo; k <= hi; k++)
            aux[k - lo] = a[k];

        // Merge back to a[lo..hi].
        for (int k = lo; k <= hi; k++) {
            if (i > mid)                     // Left half exhausted, take from the right half.
                a[k] = aux[j++ - lo];
            else if (j > hi)                 // Right half exhausted, take from the left half.
                a[k] = aux[i++ - lo];
            else if (aux[j - lo].compareTo(aux[i - lo]) < 0)   // Current key on right less than current key on left, take from the right half.
                a[k] = aux[j++ - lo];
            else                             // Current key on right greater than or equal to current key on left, take from the left half.
                a[k] = aux[i++ - lo];
        }

        return Arrays.toString(a);
    }

}
