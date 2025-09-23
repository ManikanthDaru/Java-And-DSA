package Basics.src;

import java.util.Scanner;

public class MadLibs {
    public static void main(String[] args) {

//        MAD LIBS GAME
        Scanner in = new Scanner(System.in);

        System.out.println("Enter an adjective (description): ");
        String adj1 = in.next();
        System.out.println("Enter a noun (animal or person): ");
        String noun1 = in.next();
        System.out.println("Enter an adjective (description): ");
        String adj2 = in.next();
        System.out.println("Enter a verb end with -ing (action): ");
        String verb1 = in.next();
        System.out.println("Enter an adjective (description): ");
        String adj3 = in.next();

        System.out.println("Today I went to a "+adj1+" zoo.");
        System.out.println("In an exhibition, I saw a "+noun1+".");
        System.out.println(noun1+" was "+adj2+" and "+verb1+"!");
        System.out.println("I was "+adj3+"!");
    }
}
