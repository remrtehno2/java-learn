import java.util.Scanner;

public class Challenge3game {
    public static int chisloIgroka() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("vvedite chislo: ");
        return scanner.nextInt();
    }

    public static void vichisleniye(int chislo, int randomValue) {
        if (chislo == randomValue) {
            System.out.println("verno");
        } else {
            System.out.println("ne ugadali!");
        }
    }


    public static void main() {
        int randomValue = (int) (Math.random() * 5);
        int chislo = 0;
        int tries = 3;

        do {
            // randomValue = (int) (Math.random() * 5);
            System.out.println("U vas " + tries + " popitki");

            chislo = chisloIgroka();
            vichisleniye(chislo, randomValue);
            tries--;
        } while (chislo != randomValue && tries > 0);
    }
}

