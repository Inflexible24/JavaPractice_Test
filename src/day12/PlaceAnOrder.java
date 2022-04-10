package day12;/*
6. PlaceAnOrder task:
                Ask User to enter the product name (multiple words)
                Ask the user to enter the price  (double)
                Ask the user to enter the quantity (int)
                Ask the user to enter their first name (String, single word)
            Print in the following format:
                Ex:
                    Input: "Apples" , 1.5, 5. "Luke"
                    Output:
                        Luke, your order for 5 Apples has been placed. Your total is 7.5.
 */

import java.util.Scanner;


public class PlaceAnOrder {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("What is your product name?");
        String pN= input.nextLine();


        System.out.println("What is the price?");
        double price= input.nextDouble();

        System.out.println("What is the quantity ?");
        int t = input.nextInt();

        System.out.println("What is your first name? ");
        String firstName = input.next();
        input.close();

        double totalPrice = price * t;

        System.out.println(firstName +" your order for "+ t+ " " + pN+ " has been placed."+ " Your total is "+ totalPrice);






    }
}
