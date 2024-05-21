import java.util.Scanner;

public class Challenge2 {
    public static void main(String[] args) {
/*
        for (int j = 10; j <= 22; j++) {
            //System.out.println("Dyium: " + j + " = " + j * 25.4 + "mm");

            // String output = "Dyium: " + j + " ravno " + j * 25.4 + "mm";
            // System.out.println(output);

            float mm = j * 25.4f;

            System.out.print("Dyium: ");
            System.out.print(j);
            System.out.print(" * ");
            System.out.print(mm);
            System.out.println("mm");


            // "="  ->  = ???
            // System.out.println("for(int p = 0; p < 2; p++) 23908472309847230947230987908709870987c08-09_)(*_)*)(*_");
        }

 */
/*
        System.out.print("Enter exchange: ");
        int krs = 0;
        Scanner scanner = new Scanner(System.in);
        krs = scanner.nextInt();

        if (krs > 1) {
            for (int p = 1; p <= 20; p++) {
                System.out.println("dollar: " + p + " = " + p * krs + "sum");
            }
        } else {
            System.out.println("Enter correct currency exchange");
        }

*/

        System.out.print("vvedite dva chisla");
        int g = 0;
        int d = 0;
        Scanner scanner = new Scanner(System.in);
        g = scanner.nextInt();
        d = scanner.nextInt();

        for (int i = g + 1; i < d; i++) {
            System.out.println(i);
        }
    }

}
