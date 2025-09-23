package Basics.src;

import java.util.Scanner;

public class Variables {
//    entry point of the program -> main method
    public static void main(String[] args) {
//        Variables - it is like a container to store values

//        Primitive data types -> simple values store directly in the memory (stack)
//        Non-Primitive data types -> stores memory address/reference (in stack) that points to (heap)

//        Primitive     Vs    Non-Primitive
//        int,long            String
//        float,double        Array
//        char                Objects
//        boolean

//        Steps to declare a variable
//        1. Declaration
//        2. Assignment
        int age;
//        java: variable age might not have been initialized
//        System.out.println(age);
        age = 21;
        System.out.println(age);

//        java: incompatible types: possible lossy conversion from double to int
//        age = 31.5;
//        System.out.println(age);
        int productsSold = 1200;
        int tokenNumber = 8;
        System.out.println(productsSold+" "+tokenNumber);

//        implicit type casting
        double price = 19;
        double cgpa = 3.5;
        double temperature = -20.5;
        System.out.println(price+" "+cgpa+" "+temperature);

//      char - single characters
        char grade = 'A';
        char symbol = '%';
        int currency= '$'; // stores the ASCII value of '$' in the variable
        System.out.println(grade+" "+symbol+" "+currency);

        boolean isStudent = true;
        boolean isOnline = false;

        System.out.println(isStudent? "True":"False");
        System.out.println(isOnline);

//        String - sequence of characters
        String myName = "Manikanth Daru";
        System.out.println("My name is: "+myName); // string concatenation

//      taking user input
        Scanner input=new Scanner(System.in);
        System.out.print("Enter your name: ");
//        String name = input.next();
        String name = input.nextLine();
        System.out.println(name);

        System.out.print("Enter your age: ");
        int myAge = input.nextInt();
        System.out.println(myAge);

        System.out.println("Are you a student (Say True/False): ");
        boolean isAStudent = input.nextBoolean();
        System.out.println(isAStudent? "Yes":"No");

//        calculate area of a triangle
        int base = input.nextInt();
        int height = input.nextInt();
        System.out.println("Area of a triangle is: "+0.5*base*height);
        input.close();
    }
}
