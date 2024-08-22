package odevler.bolum02;

import java.util.Scanner;

public class Q07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a valid minute: ");

        int minutes = input.nextInt();

        int oneDayToMinutes = 24 * 60;
        int oneYearToMinutes = 365 * oneDayToMinutes;

        int years = minutes / oneYearToMinutes;
        int remainingMinutes = minutes % oneYearToMinutes;
        int days = remainingMinutes / oneDayToMinutes;
        int remainingMinutesADays = remainingMinutes % oneDayToMinutes;

        System.out.println("minutes: " + remainingMinutesADays + " days: " + days + " years: " + years);
    }
}
