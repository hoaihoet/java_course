package chapter8;

import java.util.Arrays;

public class TextProcessor {
    public static void main(String[] args){

        countWords("I love Test Automation University ");
    }

    public static void countWords(String text){
        String[] words = text.split(" ");
        int numberOfWords = words.length;
        String message = String.format("You text contain %d word:  ", numberOfWords);
        System.out.println(message);

        for (int i=0; i<numberOfWords; i++){
            System.out.println(words[i]);
        }
    }


}
