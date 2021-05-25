package chapter3;

import java.util.Scanner;

public class LoanQualifiler {
    public static void main(String arg[]){
        //Initialize what we know
        int requiredSalary= 30000;
        int requiredYearsEmployee= 2;

        //Get what we don't
        System.out.println("Enter your Salary");
        Scanner scanner = new Scanner(System.in);
        double salary = scanner.nextDouble();

        System.out.println("Enter the number of year with your current empoyer:");
        double year= scanner.nextDouble();

        scanner.close();

        // Make decision
        if (salary >= requiredSalary) {
            if(year>=requiredYearsEmployee){
                System.out.println("Congrat! You quality for the loan");
            }else {
                System.out.println("Sorry, you must have worked at your current job" + requiredYearsEmployee + "year.");
            }
        }else {
            System.out.println("Sorry, you must earn at least $" + requiredSalary + "to quality for the loan ");
        }
    }
}
