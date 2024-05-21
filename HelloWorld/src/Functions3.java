public class Functions3 {
    public static void noArgsNoReturn() {
        System.out.println("Hello");
    }

    public static void withArgsNoReturn(int celcius) {
        System.out.println("The temperature is: " + celcius + "C");
    }

    public static int getCurrentTemperature() {
        // logic internet DB
        int x = 10;
        /*
        BLA BLA BLA BLA
         */

        return x;
    }

    public static int getDaysInYear(int amountOfYears) {
        return amountOfYears * 365;
    }


    public static void main(String[] args) {
        // 1) void, no args -> nameOfFunction();
        // 2) void, with args -> nameOfFunction(5);
        // 3) returns, no args -> int variable = nameOfFunction();
        // 4) returns, with args -> int variable = nameOfFunction(10);

        // 1)
        noArgsNoReturn();

        //2)
        withArgsNoReturn(5);

        // 3)
        int currentTemp = getCurrentTemperature();
        System.out.println(currentTemp);

        //4
        int amountOfDays = getDaysInYear(5);
        System.out.println(amountOfDays);

    }
}
