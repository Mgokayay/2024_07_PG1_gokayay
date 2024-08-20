package odevler.bolum02;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a degree in Celsius ");
        double celsius = scanner.nextDouble();
        double fahrenheit = (celsius * 9/5) + 32;

        System.out.printf((double)celsius + " Celsius " + fahrenheit + "Fahrenheit");

    }
}
