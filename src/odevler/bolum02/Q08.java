package odevler.bolum02;

import java.util.Scanner;

public class Q08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the time zone offset to GMT: ");

        long offset = input.nextLong();

        long totalMillis = System.currentTimeMillis();
        long totalSeconds = totalMillis / 1000;
        long currentSeconds = totalSeconds % 60;

        long totalMinutes = totalSeconds / 60;
        long currentMinutes = totalMinutes % 60;

        long totalHours = totalMinutes / 60;
        long currentHours = (totalHours + offset) % 24;

        System.out.println("the current time is " + currentHours + ":" + currentMinutes + ":" + currentSeconds);
    }
}
