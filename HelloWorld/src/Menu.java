import java.util.Scanner;

public class Menu {
    public static void shoMenuList() {
        System.out.println(" ==== The app that shows if the weather is good ==== ");
        System.out.println("1) Press 'F' to find something");
        System.out.println("2) Press 'P' to print something");
        System.out.println("3) Press 'Q' to Exit");


        System.out.print("Enter your choice: ");
    }

    public static char getPressedKey() {
        Scanner scanner = new Scanner(System.in);
        return scanner.next().charAt(0);
        // int a = scanner.nextInt();
    }

    public static void vicheslenie(char userAnswer) {
        if (userAnswer == '1' || userAnswer == '=') {
            System.out.println("You entered wrong command");
        }

        if (userAnswer == 'P') {
            System.out.println("The weather is good");
        }

        if (userAnswer == 'F') {
            System.out.println("Pressed F");
        }
    }


    public static void main(String[] args) {
        char userAnswer;

        var t = 1;
        var po = 'a';

        System.out.println(t);

        do {
            shoMenuList();

            userAnswer = getPressedKey();

            vicheslenie(userAnswer);

        } while (userAnswer != 'Q');


        shoMenuList();

//        int i = 0;
//
//        do {
//            i++;
//            System.out.print(i + " : in do while");
//        } while (i < 5);
//
//        i = 1000;



/*
        char userAnswer;

        do {
            System.out.println(" ==== The app that shows if the weather is good ==== ");
            System.out.println("1) Press 'F' to find something");
            System.out.println("2) Press 'P' to print something");
            System.out.println("3) Press 'Q' to Exit");


            System.out.print("Enter your choice: ");

            Scanner scanner = new Scanner(System.in);
            userAnswer = scanner.next().charAt(0);
            // int a = scanner.nextInt();

            if (userAnswer == '1' || userAnswer == '=') {
                System.out.println("You entered wrong command");
                break;
            }

            if (userAnswer == 'P') {
                System.out.println("The weather is good");
            }

            if (userAnswer == 'F') {
                System.out.println("Pressed F");
            }

        } while (userAnswer != 'Q' || userAnswer != 'q');

        // 2 == 2 -> true
        // 2 == 4 -> false;
        // 2 != 4 -> true;



 */
    }
}
