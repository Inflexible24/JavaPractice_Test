package day13;
/*
7. Write a program  for CheckWords, the program accepts 3 words and :
            - if they are same length:  print "All words are same length"
            - if some same length and others not:    print "Not Same nor Different lengths"
            - if all different length :  print "All different length"
 */

import java.util.Scanner;

public class CheckWords {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your woord");
        String woord = input.next();

        System.out.println("Please your second woord");
        String woord1 = input.next();

        System.out.println("Please your third woord");
        String woord3 = input.next();

        String result = "";


        if (woord.length() == woord1.length() && woord1.length() == woord3.length()){

            result="All words are same length";

        } else if (woord.length()== woord1.length()){
            result ="Not Same nor Different lengths";

        }else if (woord.length()==woord3.length()){

            result=" Not same nor Different lengths";
        }else if (woord1.length()==woord3.length()){
            result = "Not same nor Different lengths";
        }else {
            result="all different lengths";
        }

        System.out.println(result);








    }
}
