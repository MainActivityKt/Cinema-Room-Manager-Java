package cinema;

public class SeatPrinter {
    final static String SPACE = " ";
    final static String TITLE = "Cinema:";

    public static void main(String[] args) {
        System.out.println(TITLE);
        StringBuilder seats = new StringBuilder();
        for (int i = 0; i < 9; i++) {
            seats.append(i == 0 ? SPACE : i);
            seats.append(SPACE);
        }
        seats.append("\n");

        for (int i = 1; i < 8; i++) {
            seats.append(addSeats(i));
            seats.append("\n");
        }
        System.out.println(seats);
    }

    public static String addSeats(int seatNumber) {
        StringBuilder seat = new StringBuilder();
        for (int i = 0; i < 9; i++) {
            seat.append(i == 0 ? seatNumber : "S");
            seat.append(SPACE);
        }
        return seat.toString();
    }
}