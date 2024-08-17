package cinema;

import java.util.Scanner;

public class PriceCalculator {
    static char[][] cinema;
    static Scanner sc =  new Scanner(System.in);
    final static int SMALL_CINEMA_SIZE = 60;
    final static int FRONT_HALF_PRICE = 10;
    final static int BACK_HALF_PRICE = 8;
    final static String title = "Cinema:";

    public static void main(String[] args) {
        buildCinema();
        printCinema();
        reserveSeat();
        printCinema();
    }

    static void printCinema() {
        int seats = cinema[0].length;
        int rows = cinema.length;
        StringBuilder cinemaString = new StringBuilder(title + "\n");

        for (int i = 0; i <= seats; i++) {
            cinemaString.append(i == 0 ? " " : i);
            cinemaString.append(" ");
        }
        cinemaString.append("\n");

        for (int x = 0; x < rows; x++) {
            cinemaString.append(x + 1);
            cinemaString.append(" ");
            for (int y = 0; y < seats; y++) {
                cinemaString.append(cinema[x][y]);
                cinemaString.append(y != seats - 1 ? " " : "");
            }
            cinemaString.append("\n");
        }
        System.out.println(cinemaString);
    }

    static void buildCinema() {
        System.out.println("Enter the number of rows:");
        int rows = sc.nextInt();
        System.out.println("Enter the number of seats in each row:");
        int seats = sc.nextInt();

        cinema = new char[rows][seats];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < seats; j++) {
                cinema[i][j] = 'S';
            }
        }
    }

    static void reserveSeat() {
        System.out.println("Enter a row number:");
        int rowNum = sc.nextInt();

        System.out.println("Enter a seat number in that row:");
        int seatNum = sc.nextInt();
        int price;
        boolean isCinemaSmall = cinema.length * cinema[0].length <= SMALL_CINEMA_SIZE;

        if (isCinemaSmall) {
            price = FRONT_HALF_PRICE;
        } else {
            price = rowNum <= cinema.length / 2 ? FRONT_HALF_PRICE : BACK_HALF_PRICE;
        }
        System.out.format("Ticket price: $%d\n", price);
        cinema[rowNum - 1][seatNum - 1] = 'B';
    }
}