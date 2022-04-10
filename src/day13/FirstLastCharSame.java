package day13;
/*
3. write a program that can check if the first and last characters of the string are same
            ex:
                level
            output:
                same
 */

import java.util.Scanner;

public class FirstLastCharSame {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.println("enter your woord");
        String  woord = scan.next();
        scan.close();

        String result = "";

        char firstChar = woord.charAt(0),
                lastChar = woord.charAt(woord.length()-1);

        if (firstChar == lastChar){

            result="same";
        }else {
            result= "not same";
        }

        System.out.println(result);



    }
}
