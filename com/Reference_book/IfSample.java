package com.Reference_book;

import java.util.Scanner;

public class IfSample {
    public static void main(String[] args) {
//        Syntax:-
//        if(condition) stmt;
//        here stmt can be one or more(written inside curly braces)
//        int x,y;
//        x=10;
//        y=20;
        Scanner input=new Scanner(System.in);
        int x=input.nextInt();
        int y=input.nextInt();
        if(x<y) System.out.println("x is less than y"); //true
        if(x!=y) System.out.println("x is not equal to y"); //true
        x=x*2;
        if(x==y) System.out.println("x is equal to y"); //true
        if(x!=y) System.out.println("x is not equal to y"); //false
        x=x*2;
        if(x>y) System.out.println("x is greater than y"); //true
        if(x!=y) System.out.println("x is not equal to y"); //true
    }
}
