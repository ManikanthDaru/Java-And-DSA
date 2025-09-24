package Strings.src;

import java.util.ArrayList;
import java.util.Arrays;

public class Operators {
    public static void main(String[] args) {
        /* char a=120;
        a++;
        System.out.println(a);
        System.out.printf("%c\n",121);
        System.out.println('a'+'b');*/
        System.out.println("a"+"b"); //concatenation
        System.out.println("a"+1); //Why the o/p is a1?
//        Here in the above case java converts 1 from int(primitive data type)->Integer(Wrapper class)
//        and that will call .toString() method,converts 1(Integer)->"1"(String).Then concatenates.
        System.out.println("a"+1.50);
        System.out.println("a"+'b');
        System.out.println("a"+true);
        System.out.println("a"+ Arrays.toString(new int[]{1,2,3}));
        ArrayList<Integer> lst=new ArrayList<>(10);
        lst.add(10);
        lst.add(100);
        System.out.println("a"+lst);
        System.out.println(lst+" "+lst);
    }
}
