public class Main {
    public static void main(String[] args) {
        Theatre ilkhomTheatre = new Theatre("Ilkhom", 2, 13);

        ilkhomTheatre.printSeatMap();

        BookingAgent bookingAgent = new BookingAgent(ilkhomTheatre);
        bookingAgent.bookSeat("A002");
        bookingAgent.bookSeat("A002");

        ilkhomTheatre.printSeatMap();
    }
}
