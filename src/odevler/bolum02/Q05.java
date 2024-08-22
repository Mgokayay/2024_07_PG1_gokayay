package odevler.bolum02;

import java.util.Scanner;

public class Q05 {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.println("Enter a subtotal");
        double subtotal = input.nextDouble();

        System.out.println("Enter a commission amount");
        double commissionAmount = input.nextDouble();

        commissionAmount = subtotal * (commissionAmount/100);

        double total = subtotal + commissionAmount;

        System.out.println("subtotal = " + subtotal + " commission amount = " + commissionAmount + " total = " + total);
    }
}
