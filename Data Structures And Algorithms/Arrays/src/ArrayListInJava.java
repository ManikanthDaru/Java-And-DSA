// ArrayList in Java
// Definition:- Java ArrayList is a part of the collections framework and it is a class of java.util package. It provides us with dynamic-sized arrays in Java.

import java.util.ArrayList;

public class ArrayListInJava {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
//      adding elements at end of the list
        list.add(12);
        list.add(21);
        list.add(34);
        System.out.println(list);

//       adding Elements at the specific index
        list.add(2,39);
        System.out.println(list);

//        removing elements
//        using index
        list.remove(2);
//        using object value
        list.remove(Integer.valueOf(12));
        System.out.println(list);

//        updating elements
        list.set(1,55);
        System.out.println(list);
    }
}
