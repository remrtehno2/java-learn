
import java.util.NavigableSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class Theatre {
    //1) why is it static?
    static class Seat implements Comparable<Seat> {
        private String number;
        private Boolean isReserved = false;

        public void setReserved(Boolean reserved) {
            isReserved = reserved;
        }

        public Boolean getReserved() {
            return isReserved;
        }

        public Seat(String number) {
            this.number = number;
        }

        @Override
        public int compareTo(Seat o) {
//            System.out.println("Compare to: " + isReserved + " " + number + " " + o);
            if(o.isReserved) {
                return 1;
            }
            return number.compareTo(o.number);
        }

        @Override
        public String toString() {
            return "%s %s ".formatted(number, isReserved ? "(\u25CF)" : "   ");
        }
    }

    private NavigableSet<Seat> seats = new TreeSet<>();



    private String name;
    private Double seatsPerRow;

    public Theatre(String name, Integer rows, Integer totalSeats) {
        this.name = name;
        this.seatsPerRow = Math.ceil((double) totalSeats / (double) rows);
        char letter = 'A';

        for (int j = 0; j < rows; j++) {
            for (int i = 0; i < seatsPerRow; i++) {
                // 2) what if we put it after the insertion ??
                if(this.seats.size() >= totalSeats) {
                    break;
                }
                this.seats.add(new Seat(letter + "00" + i));

            }
            letter++;
        }

//        // Add each letter of the alphabet to the seats
//        for (char letter = 'A'; letter <= 'Z'; letter++) {
//
//        }
    }

    public NavigableSet<Seat> getSeats() {
        return seats;
    }

    public void printSeatMap() {
        System.out.println("-".repeat(90));
        int i = 0;
        for (Seat seat : this.seats) {
            i++;

            System.out.print(seat);
            if(i % this.seatsPerRow == 0) {
                System.out.println(" ");
            }
        }

        System.out.println(" ");
        /// why double value?
//        System.out.println("-".repeat( (int) this.seatsPerRow.doubleValue() * 10 ));
        System.out.println("-".repeat( 90));
        System.out.println(" ");
    }
}
