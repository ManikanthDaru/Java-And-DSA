package com.Reference_book;

public class ForTest {
    public static void main(String[] args) {
//        Syntax:-
//        for(initialization;condition;iteration) stmt;
//        here stmt can be one or more(written inside curly braces)
//        Shortcut:- ctrl+f->for finding specific words ctrl+r->for replacing
        int a,b;
        b=20;
        for(a=0;a<10;a++) {
            System.out.println(a);
            System.out.println(b);
            b=b-2;
        }
    }
}
