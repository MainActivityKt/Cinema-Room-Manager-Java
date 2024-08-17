package cinema;

import java.util.Scanner;

public class ProfitsCalculator {
    final static int SMALL_CINEMA_SIZE = 60;
    final static int FRONT_HALF_PRICE = 10;
    final static int BACK_HALF_PRICE = 8;

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        System.out.println("Enter the number of rows:");
        int rows = sc.nextInt();

        System.out.println("Enter the number of seats in each row:");
        int seats = sc.nextInt();

        printProfits(rows, seats);
    }

    public static void printProfits(int rows, int seats) {
        int profits = 0;
        if (rows * seats <= SMALL_CINEMA_SIZE) {
            profits = rows * seats * FRONT_HALF_PRICE;

        } else {
            int frontHalf = rows / 2;
            int backHalf = rows / 2 + rows % 2;
            profits = frontHalf * FRONT_HALF_PRICE * seats + backHalf * BACK_HALF_PRICE * seats;
        }
        System.out.println("Total income:");
        System.out.format("$%d", profits);
    }
}