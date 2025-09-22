import java.util.Arrays;
import java.util.Scanner;

public class Array_2D {
    public static void main(String[] args) {
//        Syntax:-
//        data_type[][] var_name = new data_type[rows][cols];
//        here,specifying the number of cols is not mandatory,but we should specify the number of rows
        /*int[][] a={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println(a.length);
        System.out.println(Arrays.toString(a[0]));
        System.out.println(Arrays.toString(a[1]));
        System.out.println(Arrays.toString(a[2]));*/
        Scanner input=new Scanner(System.in);
        int m=input.nextInt();
        int n= input.nextInt();
        int[][] arr=new int[m][n];
        for(int rows=0;rows<m;rows++) {
            for(int cols=0;cols<n;cols++) {
                arr[rows][cols]=input.nextInt();
            }
        }
        for(int rows=0;rows<m;rows++) {
            for(int cols=0;cols<n;cols++) {
                System.out.print(arr[rows][cols]+" ");
            }
            System.out.println();
        }
        for(int rows=0;rows<m;rows++) {
            for(int a:arr[rows]) {
                System.out.print(a+" ");
            }
            System.out.println();
        }
        for(int rows=0;rows<m;rows++) {
            System.out.println(Arrays.toString(arr[rows]));
        }
        for (int[] a:
             arr) {
            System.out.println(Arrays.toString(a));
        }
    }
}
