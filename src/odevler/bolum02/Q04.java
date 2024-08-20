package odevler.bolum02;

import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a pound ");

        double pound = sc.nextDouble();
        double kg =pound * 0.454;

        System.out.println(pound + " pound is " + kg + "kg is");
    }
}
