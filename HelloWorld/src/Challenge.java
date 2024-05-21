public class Challenge {
    public static void main(String[] args) {
        NoArgsNoReturn();
        NoArgsNoReturn();
        NoArgsNoReturn();
        NoArgsNoReturn();


        int rezultat = ploshadkomnati(2, 5);
        System.out.println(rezultat);


        String NameOfHusband = GetCurrentName();
        String otvet = yourAge(22, GetCurrentName() + "!!!" /* Igor */);
        // "Igor" + "!!!"
//        String otvet = yourAge(22, NameOfHusband
//        );

        int p = 5 + 5;
        System.out.println(p);
        System.out.println(5 + 5);

        System.out.println(otvet + " ;;; ");
    }


    public static void NoArgsNoReturn() {
        System.out.println("Zoda");
    }

    public static String GetCurrentName() {
        String NameofHusband = "Igor";

        return NameofHusband;
    }

    public static int ploshadkomnati(int h, int w) {
        return h * w;
    }

    public static String yourAge(int k, String n) {
        return "Hello " + n + " you are " + k + " years old";
    }


}







