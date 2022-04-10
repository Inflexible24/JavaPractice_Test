package day12;
/*
3. SalaryCalculator:
            3.1 Ask the user to enter his/her hourlyRate
            3.2 Ask the user how many hours he/she works in a week
            3.3 Ask the user to enter state tax r (in percentage)
            3.4 Ask the user to enter federal tax (in percentage)
            3.5 Calculate the:
                    3.4.1 salary
                    3.4.2 sateTax
                    3.4.3 federalTax
                    3.4.4 totalTax
                    3.4.5 netIncome
 */

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        System.out.println("Enter your hourly rate? ");
        double hourlyRate = scan.nextDouble();

        System.out.println("How many hours do you work in a week? ");
        int hours = scan.nextInt();

        System.out.println("Enter state tax ? "); // in percentage thats why we use /100
        double stateTax = scan.nextDouble() / 100;

        System.out.println("Enter federal tax ? "); // in percentage thats why we use /100
        double federalTax = scan.nextDouble() / 100;

        scan.close();





        double salary = hourlyRate * hours * 52; // 52 weeks a year
        double stateTaxe = salary * stateTax;
        double federal = salary * federalTax;
        double  dfmpofmop = stateTaxe + federal;
        double netIncome = salary -dfmpofmop;


        System.out.println("netIncome = " + netIncome);
        System.out.println("dfmpofmop = " + dfmpofmop);
        System.out.println("federal = " + federal);
        System.out.println("stateTaxe = " + stateTaxe);
        System.out.println("salary = " + salary);
    }
}
