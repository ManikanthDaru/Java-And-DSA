package Strings.src;
import java.util.Scanner;

public class WeightConversion {
    public static void main(String[] args) {
//        weight conversion program
        Scanner in = new Scanner(System.in);

//        declare variables
        double weight;
        double newWeight;
        int choice;

//        welcome message
        System.out.println("Weight Conversion Program");
        System.out.println("1: Convert lbs to kgs");
        System.out.println("2: Convert kgs to lbs");

//        prompt for user choice
        System.out.print("Choose an option: ");
        choice = in.nextInt();

        if(choice == 1) {
            System.out.print("Enter the weight in lbs: ");
            weight = in.nextDouble();
            newWeight = weight*0.453592;
            System.out.printf("The new weight in kgs is: %.2f",newWeight);
        }
        else if(choice == 2) {
            System.out.print("Enter the weight in kgs: ");
            weight = in.nextDouble();
            newWeight = weight*2.20462;
            System.out.printf("The new weight in lbs is: %.2f",newWeight);
        }
        else {
            System.out.println("Invalid Choice");
        }

//        Ternary operator
//        variable = (condition)? value1(if True): value2(if False)
        int score = 55;
        boolean isPass = (score>=36)? true: false;
        System.out.println(isPass? "Pass" : "Fail");

        int hours = 23;
        String timeOfDay = (hours>=0 && hours<12)? "A.M" : "P.M";
        System.out.println(timeOfDay);

//        temperature conversion
        double temp;
        double newTemp;
        String unit;

        System.out.print("Enter the temperature: ");
        temp = in.nextDouble();

        System.out.println("Convert to Celsius or Fahrenheit? (C or F)");
        unit = in.next().toUpperCase();

        newTemp = (unit.equals("C"))? (temp-32)*5/9 : (temp*9/5)+32;
        System.out.printf("%.2f",newTemp);

        in.close();
    }
}
