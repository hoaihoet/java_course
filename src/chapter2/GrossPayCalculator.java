package chapter2;

import java.util.Scanner;

public class GrossPayCalculator {
    public static void main (String arg[]){
        // Get the number of hours the employee works
        System.out.println("Enter the number of hours the employee worked :");
        Scanner scanner= new Scanner(System.in);
        int hours= scanner.nextInt();

        // Get the hourly pay rate
        System.out.println("Enter the employee's pay rate :");
        double rate= scanner.nextDouble();
        scanner.close();

        // Multiply hours and pay rate
        double grossPay= hours * rate;

        // Display result
        System.out.println("Gross pay : " +grossPay);
    }
}
