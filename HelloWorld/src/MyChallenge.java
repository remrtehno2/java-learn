import java.util.Scanner;

public class MyChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int countOfEnters = 0;
        boolean userEnteredInt = true;

        do {
            userEnteredInt = scanner.hasNextInt();

            if (userEnteredInt) {
                sum = sum + scanner.nextInt();
                countOfEnters++;
            }

        } while (userEnteredInt);

        int avg = Math.round((float) sum / countOfEnters);

        System.out.println("SUM = " + sum + " AVG = " + avg);


    }
}
