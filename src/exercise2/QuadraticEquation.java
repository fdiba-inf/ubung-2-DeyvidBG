package exercise2;

import java.util.Scanner;
import java.lang.Math;

public class QuadraticEquation {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = input.nextInt();

        System.out.print("Enter b: ");
        int b = input.nextInt();

        System.out.print("Enter c: ");
        int c = input.nextInt();

        if(a!=0) {
          double diskriminante = Math.pow(b, 2) - 4*a*c;
          if(diskriminante >= 0) {
            double x1 = (-b + Math.sqrt(diskriminante))/2;
            double x2 = (-b + Math.sqrt(diskriminante))/2;
            System.out.println(x1 + ", " + x2);
          } else {
            System.out.println("Imaginary values");
          }
        } else {
          if(b!=0) {
            double x = -(c/b);
            System.out.println(x);
          } else {
            if(c!=0) {
              System.out.println("No values");
            } else {
              System.out.println("Many values");
            }
          }
    }
    }
}