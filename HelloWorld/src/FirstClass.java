public class FirstClass {


    public static void main(String[] args) {
/////////
//
//        int M = 50;
//        System.out.println(M);
//
//        String myName = "Zoda";
//        System.out.println(myName);
//
//        int age = 20;
//        if (age > 18) {
//            System.out.print("mojno");
//        } else {
//            System.out.print("nelzya");
//        }
//
//
//        Scanner scanner = new Scanner(System.in);
//
//        // Prompt the user for input
//        System.out.print("Please enter your name: ");
//
//        // Read a line of text entered by the user
//        String name = scanner.nextLine();
//        int tmp = scanner.nextInt();
//
//
//        System.out.print(name);
//        System.out.print(tmp + 20);
//
//
//        boolean isAlien = false;
//
//        if (isAlien == true) { // false
//
//        }
//
//        if (isAlien) { // false
//
//        }


        // true == false = false;
        // false == false = true;

        boolean isAlien = false;


        if (isAlien) {
            System.out.print("TRUE");
            System.out.print("IS ALIEN");
        }

        String hello = "Hello";
        String name = "Zoda";
        boolean isNameProvided = false;
        String out = "";
/*
        if (isNameProvided) {
            out += hello + " " + name;
        } else {
            out += "Name is not provided";
        }
  */

        out = isNameProvided ? hello + " " + name : "Name is not provided";

        System.out.print(out);


////////
    }
}











/*
        System.out.print("Hello World");


        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Please enter your name: ");

        // Read a line of text entered by the user
        String name = scanner.nextLine();


        System.out.print(name);
 */