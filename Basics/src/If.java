package Basics.src;

import java.util.Scanner;

public class If {
    public static void main(String[] args) {
        /*Syntax:-
        if(condition) {
        body;
        }*/
        Scanner input=new Scanner(System.in);
        int a=input.nextInt();
        if(a<11) {
            System.out.println("Hello World!");
        }
    }
}
