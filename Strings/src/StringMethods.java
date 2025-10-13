package Strings.src;

import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args) {

        String name = " Brod Code  ";

        int length = name.length();
        System.out.println(length);

        char letter = name.charAt(4);
        System.out.println(letter);

        int index = name.indexOf('x');
        System.out.println(index);

//        program for finding count of vowels in a string
        Scanner in = new Scanner(System.in);
        String vowels = "aeiouAEIOU";
        String input = in.next(); // Manikanth
        int cnt = 0;
        for(int i=0;i<input.length();i++) {
            char ch = input.charAt(i);
            if(vowels.indexOf(ch)!=-1) cnt++;
        }
        System.out.println(cnt);

        int lastIndex = name.lastIndexOf("do");
        System.out.println(lastIndex);

        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name);
        System.out.println(name.trim());

        name = name.replace("od","a");
        System.out.println(name);

        System.out.println(name.contains("  "));
        System.out.println(name.equals("password"));
        System.out.println("abc".equalsIgnoreCase("AbC"));

//        .substring() - a method used to extract a portion of a string
//        .substring(start,end)

        String email = "mani55kanth@gmail.com";
        String username = email.substring(0,11);
        System.out.println(username);
        String domain = email.substring(11);
        System.out.println(domain);
    }
}
