public class Astrixes {
    public void printAstrix(int  astrixes) {
        for (int i = astrixes; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    /*

      ********
       ******
        ****
         **

     */
}
