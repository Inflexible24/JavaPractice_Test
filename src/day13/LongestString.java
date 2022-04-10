package day13;
/*
2. write a program that asks user to enter two strings, and print out the longest string
 */

import java.util.Scanner;

public class LongestString {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);


        System.out.println(" Write your  first fullname!");
        String f = scan.nextLine();


        System.out.println("Write your first lastname!");
        String n = scan.nextLine();


        if (f.length() > n.length()) {
            System.out.println(f);
        } else if (n.length() > f.length()) {
            System.out.println(n);
        } else {
            System.out.println("Both have same length");
        }


    }
}
