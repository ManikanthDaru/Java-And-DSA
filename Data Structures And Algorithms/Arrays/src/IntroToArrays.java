// Concept:-

// Arrays
// 1. Array is a simple linear data structure.
// 2. An array stores elements of similar data type at contiguous memory locations.
// 3. An array stores items (in case of C/C++ and Java Primitive Arrays) or their references (in case of Python, JS, Java Non-Primitive) at contiguous locations. It offers mainly the following advantages over other data structures.
// 4. Random Access : i-th item can be accessed in O(1) Time as we have the base address and every item or reference is of same size.
// 5. Cache Friendliness : Since items / references are stored at contiguous locations, we get the advantage of locality of reference.
// 6. It is not useful in places where we have operations like insert in the middle, delete from middle and search in an unsorted data.
// 7. It is a fundamental and linear data structure using which we build other data structures like Stack Queue, Deque, Graph, Hash Table, etc.

// Classification of arrays
// 1. Based on size of the array
// -> Fixed sized array - Arrays in Java
// -> Dynamic sized array - ArrayList in Java
// 2. Based on dimensions of the array
// -> 1-D array
// -> 2-D (Array of arrays / matrices),3-D (Array of matrices),...

import java.util.*;

public class IntroToArrays {
    public static void main(String[] args) {
//        static memory allocation
//        fixed size arrays
//        1-D array
        int[] arr = new int[5]; // array declaration and default initialization
        System.out.println(Arrays.toString(arr));
        for(int i=0;i<5;i++) {
            arr[i] = i;
        }
        float[] farr = { 1.4f, 2.0f, 24f, 5.0f, 0.0f };
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(farr));

//        dynamic memory allocation
//        dynamic sized array
        ArrayList<Integer> list = new ArrayList<>();
        list.add(123);
        list.add(456);
        list.add(789);
        System.out.println(list);

//        2-D array
        int[][] mat = {{0,1,2},{3,4,5},{6,7,8}};
//        System.out.println(Arrays.toString(mat)); this prints array containing references to array elements
        for(int[] nums: mat) {
            System.out.println(Arrays.toString(nums));
        }
    }
}
