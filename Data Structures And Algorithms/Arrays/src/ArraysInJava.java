import java.util.*;
// Arrays in Java
// 1. An array is simple linear data structure used to store multiple elements of same data type
// 2. Arrays in Java are objects, like all other objects in Java, arrays implicitly inherit from the java.lang.Object class. This allows you to invoke methods defined in Object (such as toString(), equals() and hashCode()).
// 3. arr.length - this length property give the size of the array
public class ArraysInJava {
    public static void main(String[] args) {
//        Array declaration
//        Method 1: int arr[];
//        Method 2: int[] arr;
        int[] arr;
        arr = new int[5];
        System.out.println(Arrays.toString(arr));

//        initializing an array
//        using array literal
//        int[] arr = {1,2,3,4,5};

//        using for loop
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
//        length property
        int n = arr.length;
        System.out.println(n);
        System.out.println(Arrays.toString(arr));

//        using loop for printing
        for(int i=0;i<n;i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
//        using for each loop
        for(int num: arr) {
            System.out.print(num+" ");
        }
        System.out.println();
    }
}
