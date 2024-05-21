package dev.lpa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class Item {
    public static void main(String[] args) {


        Object[] myObjArr = new Object[10];

        myObjArr[1] = """
                wqeq
                """;


        int[] mynuMs = new int[]{1,0};
        int[] mynuMs2 = {1,0};

        System.out.println(mynuMs2.length);

        testArr("Hello", "Test");
        System.out.println("-".repeat(20));
        testArr(new String[]{"Test", "Test2"});


        int[][][] multi = new int[2][2][2];
        System.out.println(Arrays.deepToString(multi));

        ArrayList<Integer> iiin = new ArrayList<Integer>();
        // iiin.ensureCapacity();
    }

    static public void testArr(String... arg) {
        System.out.println(Arrays.toString(arg));
        for (String str : arg) {
            System.out.println(str);
        }
    }
}
