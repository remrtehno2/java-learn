import java.util.Scanner;


public class Challenge2Calculator {

    public static int zapros1chisla() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("vvedite 1 chislo: ");
        return scanner.nextInt();
    }

    public static int zapros2chisla() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("vvedite 2 chislo: ");
        return scanner.nextInt();
    }

    public static char zaprosOperator() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("vvedite operator: ");
        return scanner.next().charAt(0);


    }

    public static void vichisleniye(int H, int K, char elements) {

        System.out.print("resultat: ");

        if (elements == '+') {
            System.out.print(H + K);
        }
        if (elements == '-') {
            System.out.print(H - K);
        }
        if (elements == '*') {
            System.out.print(H * K);
        }
        if (elements == '/') {
            System.out.print(H / K);
        }


    }


    public static void main(String[] args) {
        int H = 0;
        int K = 0;
        char operator;

        H = zapros1chisla();
        K = zapros2chisla();
        operator = zaprosOperator();


        vichisleniye(H, K, operator);
    }


//        System.out.print("vvedite operator: ");
//        elements = scanner.next().charAt(0);
//
//        System.out.print("resultat: ");
//
//        if (elements == '+') {
//            System.out.print(H + K);
//        }
//        if (elements == '-') {
//            System.out.print(H - K);
//        }
//        if (elements == '*') {
//            System.out.print(H * K);
//        }
//        if (elements == '/') {
//            System.out.print(H / K);
//        }
//    }
//}



/*
    public static void main(String[] args) {
        int H = 0;
        int K = 0;
        char elements;
        Scanner scanner = new Scanner(System.in);

        System.out.print("vvedite 1 chislo: ");
        H = scanner.nextInt();

        System.out.print("vvedite 2 chislo: ");
        K = scanner.nextInt();

        System.out.print("vvedite operator: ");
        elements = scanner.next().charAt(0);

        System.out.print("resultat: ");

        if (elements == '+') {
            System.out.print(H + K);
        }
        if (elements == '-') {
            System.out.print(H - K);
        }
        if (elements == '*') {
            System.out.print(H * K);
        }
        if (elements == '/') {
            System.out.print(H / K);
        }
    }
 */
}