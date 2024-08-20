package odevler.bolum02;

import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter radius");
        double radius = sc.nextDouble();
        double area = Math.PI * radius * radius;

        System.out.println("Enter height");
        double height = sc.nextDouble();
        double volume = area * height;

        System.out.println(area + " area is " + volume + "volume is") ;
    }
}
