package day13;
/*
1. write a program that asks user to enter a sentence.
then print the first & last characters of the sentence
 */

import java.util.Scanner;

public class FirstLastCharactersOfSentence {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter your Sentence");
        String sentence = input.nextLine();

        char firstIndex = sentence.charAt(0);
        char lastIndex = sentence.charAt(sentence.length() - 1);

        String result = firstIndex + "" + lastIndex;

        System.out.println(result);

    }
}
