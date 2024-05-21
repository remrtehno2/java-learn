import java.util.NavigableSet;

public class Main {
    public static void main(String[] args) {
        var theatre1 = new Theatre("Navai", 3, 12);
        var theatre12 = new Theatre("Navai", 3, 12);

        Theatre.printSeat(theatre1);
        theatre1.printSeat();


//        new Theater("Navoi", 2, 10);
        //A      * * * * *
        //B      * * * * *
        // 10 / 2 = 5

//        new Theater("Navoi", 4, 12);
        //A      * * *
        //B      * * *
        //C      * * *
        //D      * * *
        // 12 / 4 = 3

        //        new Theater("Navoi", 3, 12);
        //      * * * *
        //      * * * *
        //      * * * *
        // 12 / 3 = 4


    }
}