public class BookingAgent {
    Theatre theatre;

    public BookingAgent(Theatre theatre) {
        this.theatre = theatre;
    }

    public void bookSeat(String seatNumber) {
        var seat = this.theatre.getSeats().ceiling(new Theatre.Seat(seatNumber));
        if(seat != null) seat.setReserved(true);
    }


}
