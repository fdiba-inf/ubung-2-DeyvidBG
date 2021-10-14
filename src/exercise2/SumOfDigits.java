package exercise2;

import java.util.Scanner;

public class SumOfDigits {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();
        int sum = 0;

        if(number < 0 || number > 999) {
          System.out.println("Why");
        } else {

          String stringInteger = Integer.toString(number);
          for (int i = 0; i < stringInteger.length(); i++)
          {
            sum += Character.getNumericValue(stringInteger.charAt(i));
          }

        System.out.println("Sum of digits: " + sum);
        }
        
    }

}