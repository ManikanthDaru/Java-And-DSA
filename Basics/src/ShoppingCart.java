package Basics.src;

import java.util.Scanner;

public class ShoppingCart {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String item;
        double price;
        int quantity;
        char currency = '$';
        double total;

        System.out.println("What item would you like to buy?: ");
        item = in.nextLine().trim();
//        System.out.println(item);

        System.out.println("What is the price for each?: ");
        price = in.nextDouble();
//        System.out.println(price);

        System.out.println("How many would you like?: ");
        quantity = in.nextInt();
//        System.out.println(quantity);

        total = price*quantity;
        System.out.println("\nYou have bought "+quantity+" "+item+"/s.");
        System.out.println("Your total is: "+currency+total);
        in.close();
    }
}
