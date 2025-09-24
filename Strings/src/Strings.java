package Strings.src;

import java.util.Arrays;

public class Strings {
    public static void main(String[] args) {
//        String - it is a sequence of characters
        String str="Hello";

//        converting string to a char array
        char[] arr=str.toCharArray();
        System.out.println(Arrays.toString(arr));

        int index=str.indexOf('m'); // -1
        System.out.println(index);

        String substr=str.substring(2,4);
        System.out.println(substr);

//        for printing all the substrings
//        "H","He","Hel","Hell","Hello"-5
//        "e","el","ell","ello" -4
//        "l","ll","llo" -3
//        "l","lo"-2
//        "o"-1
//        Total number of substrings is given by n*(n+1)/2, where n is size of the string
        for(int i=0;i<str.length();i++) {
            for(int j=i+1;j<=str.length();j++) {
                System.out.println(str.substring(i,j));
            }
        }

        System.out.println(str);
        str="World";
        System.out.println(str);
        int a=100;
        System.out.println(a);
        int[] arr1={1,2,3,4,5};
        System.out.println(Arrays.toString(arr1));
        int[][] arr2={{1,6},{2,7},{3,8},{4,9},{5,10}};
        System.out.println(Arrays.toString(arr2));
        String str2="Manikanth Daru"; //String->is a wrapper class and also immutable
        System.out.println(str2);
        str2="Manikanth";
        System.out.println(str2);
        System.out.println(str2.charAt(0));
    }
}
