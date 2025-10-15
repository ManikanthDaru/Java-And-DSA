package Strings.src;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class EnhancedSwitch {
    public static void main(String[] args) {

//        enhanced switch - A replacement to many else if statements (Java 14 feature)
        Scanner in = new Scanner(System.in);
        String day = in.next();

        switch(day) {
            case "Monday","Tuesday","Wednesday","Thursday","Friday" -> System.out.println("It is a weekday 😒");
            case "Saturday","Sunday" -> System.out.println("It is weekend 😊");
            default -> System.out.println(day + " is not a day");
        }

//        calculator program
        double num1;
        double num2;
        char operator;
        double result = 0;

        System.out.println("Enter the first number: ");
        num1 = in.nextDouble();

        System.out.println("Enter an operator (+, -, *, /, ^): ");
        operator = in.next().charAt(0);

        System.out.println("Enter the second number: ");
        num2 = in.nextDouble();
        boolean valid = true;

        switch(operator) {
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> {
                if(num2!=0) {
                    result = num1 / num2;
                }
                else {
                    System.out.println("Cannot divide by zero");
                    valid = false;
                }
            }
            case '^' -> result = Math.pow(num1,num2);
            default -> {
                System.out.println("Invalid Choice");
                valid = false;
            }
        }

        if(valid) {
            System.out.println(result);
        }
        in.close();
    }
}
