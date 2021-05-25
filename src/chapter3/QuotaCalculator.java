package chapter3;

import java.util.Scanner;

public class QuotaCalculator {
    public static void main(String arg[]){
        //initialize values we know
        int quota=10;

        //Get unknow values
        System.out.println("Enter the number of sales you made this week: ");
        Scanner scanner = new Scanner(System.in);
        int sales= scanner.nextInt();
        scanner.close();

        //Make a decision on the path to take - Output

        if(sales>=quota){
            System.out.println("Congrats! You've met your quota ");
        }
        else {
            int salesShort = quota -sales;
          System.out.println("You did not make your quota. You were" + salesShort + "sales short" );
        }
    }
}
