import java.util.Arrays;
import java.util.Scanner;

public class Array_1D {
    public static void main(String[] args) {
        /*
//        array of primitives
        Scanner input=new Scanner(System.in);
        int a=19,n; //n->size of an array
//        array ->it is a collection of similar datatypes
//        Syntax:-
//        data_type[] var_name = new data_type[size];
//        here, data_type[] var_name; ->Declaration of an array (var_name is getting defined in the stack)
//        var_name = new data_type[size] ->Initialization of an array (in this step object is created in the heap)
        n=input.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++) {
            arr[i]=input.nextInt();
        }
//        for-each loop (or) enhanced for loop
        for (int j : arr) { //for every element in the array print the element
            System.out.println(j); //here j represents the element of the array
        }
        System.out.println(Arrays.toString(arr));
//        System.out.println(arr[arr.length]); ->index out of bound error
        arr[0]=1;
        arr[1]=2;
        arr[2]=3;
        arr[3]=4;
        arr[4]=5;
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);
//        int[] arr1={1,2,3,4,5};
        */
//        array of objects
        Scanner input=new Scanner(System.in);
        String[] str=new String[5];
        for (int i = 0; i < str.length; i++) {
            str[i]=input.next();
        }
        System.out.println(Arrays.toString(str));
        str[1]="Manikanth Daru";
        System.out.println(Arrays.toString(str));
    }
}
