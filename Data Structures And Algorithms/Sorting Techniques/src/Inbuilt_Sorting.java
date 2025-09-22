import java.util.*;

public class Inbuilt_Sorting {
    public static void main(String[] args) {

//        Arrays.sort() - The Arrays.sort() method is used for sorting the elements in an Array
//        When we are sorting an array of primitive types, Arrays.sort() does not allow us to provide a custom comparator. We can sort primitive types in natural order or increasing order, or non-decreasing order.
        int[] arr = {-1,33,-99,0,200};
//        normal sort method - sorts in ascending order
        Arrays.sort(arr); // TC - O(NlogN), it is in-place sorted
        System.out.println(Arrays.toString(arr));
//        overloaded sort method - sorts a part of array or sub array
        int[] arr2 = {-99,-100,45,-1,0};
        Arrays.sort(arr2,2,5);
        System.out.println(Arrays.toString(arr2));

        Integer[] arr3 = {-1,3,100,-99,-100};
//        use Collections.ReverseOrder() as a comparator - to get array in descending order
//        we can use it only with wrapper classes like Integer, Float, Boolean, String
        Arrays.sort(arr3,Collections.reverseOrder());
        System.out.println(Arrays.toString(arr3));

        String[] a = { "practice.geeksforgeeks.org",
                "www.geeksforgeeks.org",
                "code.geeksforgeeks.org" };
        Arrays.sort(a);
        Arrays.sort(a,Collections.reverseOrder());
        System.out.println(Arrays.toString(a));

        List<Integer> list= new ArrayList<>();
        list.add(-99);
        list.add(0);
        list.add(100);
        list.add(5);

//        Collections.sort(list);
//        Collections.sort(list,Collections.reverseOrder());

        System.out.println(list);

//        how to sort the numbers based on last digit
//        this is possible using comparator - it's given as second input to the sort method
//        a comparator is an interface in Java
//        an interface can be implemented in two ways i.e
//        1. using anonymous class
//        2. a class which implements comparator interface

        Comparator<Integer> com = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(o1%10<o2%10) {
                    return 1;
                }
                else if(o1%10> o2%10) return -1;
                else return 0;
            }
        };

        Comparator<String> com2 = new Comparator<String>() {
            @Override
            public int compare(String s1,String s2) {
                if(s1.length()>s2.length()) {
                    return 1;
                }
                else if(s1.length()<s2.length()) return -1;
                else return 0;
            }
        };

        Collections.sort(list,com);
        System.out.println(list);
//        System.out.println(-99%10); -> -9

        Arrays.sort(a,com2);
        System.out.println(Arrays.toString(a));
    }
}
