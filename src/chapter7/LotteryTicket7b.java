package chapter7;

import java.util.Arrays;
import java.util.Random;

public class LotteryTicket7b {
    private static final int LENGTH=6;
    private static final int MAX_TICKET_NUMBER=69;


    public static void main(String arg[]){
       int[] ticket=generateNumbers();
       Arrays.sort(ticket);
       printTicket(ticket);
    }

    public static int[] generateNumbers(){
        int[] ticket = new int[LENGTH];
        Random random = new Random();
        for (int i=0; i<LENGTH; i++){
            int ranDomNumber ;
            //Generate random number then search
            do{
                ranDomNumber = random.nextInt(MAX_TICKET_NUMBER)+1;
            }while (search(ticket,ranDomNumber));

            //Number is unique
            ticket[i] = ranDomNumber;
        }
        return ticket;
    }

    public static boolean search(int[] array, int numberToSearchFor){
        for(int value: array){
            if (value==numberToSearchFor){
                return true;
            }
        }
        return false;
    }

    public static boolean binarySearch(int[] array, int numberToSearchFor){
        //Array must be sorted first
        Arrays.sort(array);
        int index= Arrays.binarySearch(array,numberToSearchFor);
        if(index>=0){
            return true;
        }else return false;
    }

    public static void printTicket( int ticket[]){
        for (int i=0; i< LENGTH ;i++){
            System.out.print(ticket[i] + " | ");
        }
    }
}
