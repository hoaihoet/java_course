package chapter13;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String args[]){
       // createNewFile();
        numbersExceptionHandling();
      //  createNewFileRethow();
    }

    public static void createNewFile(){
        File file = new File("resources/nonexistent.ext");
        try {
            file.createNewFile();
        }catch (IOException e){
            System.out.println("Directory does not exist.");
            e.printStackTrace();
        }
    }

    public static void createNewFileRethow() throws IOException{
        File file = new File("resources/nonexistent.ext");
            file.createNewFile();
    }

    public static void numbersExceptionHandling() {
        File file = new File("resources/numbers.txt");
        try (Scanner fileReader = new Scanner(file)) {
            while (fileReader.hasNext()) {
                double num = fileReader.nextDouble();
                System.out.println(num);
            }
        } catch (FileNotFoundException | InputMismatchException e) {
            e.printStackTrace();
        }
    }
}
