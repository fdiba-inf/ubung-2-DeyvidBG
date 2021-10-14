package exercise2;

import java.util.Scanner;
import java.lang.Math;

public class Circle {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a radius: ");
        double radius = input.nextFloat();

        float circumReference = 2*Math.PI*radius;
        float area = Math.PI*Math.pow(radius, 2);
        

        System.out.println("Circum Reference: " + circumReference);
        System.out.println("Area: " + area);
    }

}

