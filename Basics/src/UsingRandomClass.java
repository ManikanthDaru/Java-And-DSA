package Basics.src;

import java.util.Random;

public class UsingRandomClass {
    public static void main(String[] args) {

        Random random = new Random();
//        int number = random.nextInt(); - we can get a very large number
        int number1 = random.nextInt(1,7);
        System.out.println(number1);
        double number2 = random.nextDouble(1,7);
        System.out.println(number2);
        boolean isGood = random.nextBoolean();
        System.out.println(isGood);
    }
}
