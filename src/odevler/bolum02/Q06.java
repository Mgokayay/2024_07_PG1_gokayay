package odevler.bolum02;

import java.util.Scanner;

public class Q06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer between 0 and 1000: ");

        int num = input.nextInt();

        int onesDigits = num % 10;
        int tenDigits = (num / 10) % 10;
        int hundredDigits = (num  /100) % 10;

        int sum = onesDigits + tenDigits + hundredDigits;

        System.out.println("sum = " + sum);

    }
}
