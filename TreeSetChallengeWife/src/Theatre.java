import java.util.NavigableSet;
import java.util.TreeSet;

public class Theatre {
    class Seat implements Comparable<Seat>{
        public String name;
        public boolean isReserved;

        @Override
        public int compareTo(Seat o) {
            return name.compareTo(o.name);
        }

        public Seat(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name + " ";
        }
    }

    public String name;
    public int rows;
    public int totalSeat;
    public NavigableSet<Seat> seats = new TreeSet<>();


    public Theatre(String name, int rows, int totalSeat) {
        this.name = name;
        this.rows = rows;
        this.totalSeat = totalSeat;

        var seatsPerRow = totalSeat / rows;
        char letter = 'A';

        for (int j = 0; j < rows; j++) {
            for (int i = 0; i < seatsPerRow; i++) {
                this.seats.add(new Seat(letter + "00" + i));
            }
            letter++;
        }

    }

    public static void printSeat(Theatre theatre){
        int i = 0;
        for (var seat : theatre.seats) {
            i++;
            System.out.print(seat);
            if(i % (theatre.totalSeat / theatre.rows)  == 0) {
                System.out.print("\n");
            }
        }
    }

    public void printSeat(){
        int i = 0;
        for (var seat : seats) {
            i++;
            System.out.print(seat);
            if(i % (totalSeat / rows)  == 0) {
                System.out.print("\n");
            }
        }
    }
}
