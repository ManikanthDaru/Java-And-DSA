package Basics.src;

import java.util.Scanner;

// Conditional statements - simple if, if else, nested if, if else ladder
public class If {
    public static void main(String[] args) {
//        if stmt - performs a block of code if its condition is true
        /*Syntax:-
        if(condition) {
            // body
        }*/
        Scanner input=new Scanner(System.in);
        int a=input.nextInt();
        if(a<11) {
            System.out.println("Hello World!");
        }

//        if else
        /*Syntax:-
        if(condition) {
            // body
        }
        else {
            // body
        }*/
        int age = input.nextInt();
        if(age>=18) {
            System.out.println("Adult");
        }
        else {
            System.out.println("Child");
        }

//      nested if
        /*Syntax:-
        if(condition1) {
            if(condition2) {
                // body
            }
            else {
                // body
            }
        }*/
        int year = input.nextInt();
        if(year%4==0) {
            if(year%100==0) {
                if(year%400==0) {
                    System.out.println("It's a leap year");
                }
                else {
                    System.out.println("Not a leap year");
                }
            }
            else {
                System.out.println("It's a leap year");
            }
        }
        else {
            System.out.println("Not a leap year");
        }

//        if else ladder
        /*Syntax:-
        if(condition) {
            // body
        }
        else if(condition2) {
            //body
        }
        else {
            //body
        }*/
        int marks = input.nextInt();
        if(marks>=91) {
            System.out.println("A");
        }
        else if(marks>=81) {
            System.out.println("B");
        }
        else {
            System.out.println("C");
        }
    }
}
