import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;


//

public class Main {
    public static Random random = new Random();
    public static List<Integer> currentDice = new ArrayList<>();
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println(currentDice);

        int rolls = 0;

        do {
            String userInput = scanner.nextLine();

            if (userInput.toUpperCase().contains("ALL")) {
                getRandomValues();
            } else {
                String[] numbsUserEntered = getParsedNumbs(userInput);
                processNumbers(numbsUserEntered);
            }

            System.out.println(currentDice);
        } while (++rolls < 5);


        System.out.println("Game is Ended");

    }

    public static void getRandomValues() {
        currentDice.addAll(random.ints(1, 6).limit(5).boxed().toList());
    }

    public static void processNumbers(String[] args) {
        for (String num : args) {
            Integer numb = Integer.valueOf(num);
            int indexNum = currentDice.indexOf(numb);

            if (indexNum > -1) {
                currentDice.set(indexNum, random.nextInt(1, 5));
            }
        }
    }

    public static String[] getParsedNumbs(String string) {
        return string.split(" ");
    }
}