package chapter4;

import java.util.Scanner;

public class AverageTestScore {
    public static void main(String arg[]){
        //Initilize what we know
         int numberOfStudent = 24;
         int numberOfTest = 4;

        Scanner scanner = new Scanner(System.in);
         //Process all students
        for (int i = 0; i < numberOfStudent; i++){

            double total = 0;
            for (int j = 0; j < numberOfTest; j++){
                System.out.println("Enter the score for Test # " + (j+1));
                double score = scanner.nextDouble();
                total = total + score;
            }
            double average= total/numberOfTest;
            System.out.println("The test average for student # "+(i+1)+" is "+ average);
        }
        scanner.close();
    }
}
