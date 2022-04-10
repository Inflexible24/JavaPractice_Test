package day13;
/*
4. write a program that can return the initials of the user
            ex:
                cydeo
                school
            output:
                C.S
        Note: Pay attention to the example output
 */

import java.util.Scanner;

public class Initial {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);


        System.out.println("enter your first name?");
        String firstName = input.nextLine();

        System.out.println("Enter your last name?");
        String lastName = input.nextLine();

        input.close();

        char f = firstName.toUpperCase().charAt(0);
        char l = lastName.toUpperCase().charAt(0);


        String result = f+"."+l;

        System.out.println(result);




    }
}
