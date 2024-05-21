public class Main {
    public static void main(String[] args) {
        String[] myArray = {"Hello", "I am an array", "Text", "Test"};
                            // 0       1                 2      3
        System.out.println(myArray[0]);
        System.out.println(myArray[2]);

        // Запись в массив
        System.out.println("==========");
        System.out.println(myArray[1]);
        myArray[1] = "new text";
        System.out.println(myArray[1]);

        System.out.println("Length:");
        System.out.println(myArray.length);

        for(int i = 0; i < myArray.length; i++) {
//            myArray[i] = "Test";
            System.out.println(myArray[i]);
        }

        for (String s : myArray) {
            System.out.println(s);
        }



        //
        // Initialize and fill a 2D array
        int[][] anotherMatrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };

        for (int[] myarr : anotherMatrix) {
            for(int mynum : myarr){
                System.out.println(mynum);
            }
        }


        StaticNewClass staticNewClass = StaticNewClass.getInstance();
        System.out.println(staticNewClass.name);

        System.out.println("JQKA".indexOf('A'));
        System.out.println("JQKA".indexOf('B'));
        System.out.println("JQKA".indexOf('J'));


        ZamenaClassu zamenaClassu = new ZamenaClassu("HI zamwna", 1);
        System.out.println(zamenaClassu.name());



        // ENUM
        enum Suit2 {
            CLUB, DIAMOND, HEART, SPADE, POL, POWW,
        }
        System.out.println(Suit2.POWW);
        System.out.println(Suit2.CLUB);

        enum Suit {
            CLUB, DIAMOND, HEART, SPADE;
            // 0   1       2      3

            public char getImage() {
                return (new char[]{9827, 9830, 9829, 9824})[this.ordinal()];
            }
        }

      System.out.println(  Suit.DIAMOND.getImage());
        System.out.println(  Suit.HEART.getImage());
        System.out.println("\u2663");

        System.out.printf("%s %s %s", 1, 2, 3);

    }
}
