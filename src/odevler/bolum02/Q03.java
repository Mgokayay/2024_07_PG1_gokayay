package odevler.bolum02;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a feet value");
        double feet = sc.nextDouble();
        double meters = feet * 0.305;

        System.out.println(feet + " feet is " + meters + " meters");
    }
}
