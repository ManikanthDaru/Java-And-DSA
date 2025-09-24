package Basics.src;

import java.util.Scanner;

public class CICalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        Compound Interest Calculator
        double principal;
        double rate;
        int timesCompounded;
        int years;
        double amount;

        System.out.println("Enter the principal amount: ");
        principal = in.nextDouble();

        System.out.println("Enter the interest rate (in %): ");
        rate = in.nextDouble()/100;

        System.out.println("Enter the # times compounded per year: ");
        timesCompounded = in.nextInt();

        System.out.println("Enter the # of years: ");
        years = in.nextInt();

        amount = principal * Math.pow(1+ rate/timesCompounded,timesCompounded*years);

        System.out.printf("The amount after %d years is: $%.2f",years,amount);

        in.close();
    }
}
