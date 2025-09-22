import java.util.Scanner;

public class Swapping {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Size of the array is:");
        int n=input.nextInt();
        System.out.println("Input the elements of the array:");
        int[] arr=new int[n];
        for(int i=0;i<n;i++) {
            arr[i]=input.nextInt();
        }
        System.out.println("Mention the indexes:");
        int i1=input.nextInt();
        int i2=input.nextInt();
        System.out.println("Array before swapping is:");
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
        swap(arr,i1,i2);
        System.out.println("\nArray after swapping is:");
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
        reverse(arr);
        System.out.println("\nReversed array is:");
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void reverse(int[] a) {
        int start=0,end=a.length-1;
        while(start<end) {
            swap(a,start,end);
            start++;
            end--;
        }
    }
    public static void swap(int[] a,int b,int c) {
//        M-1 (using a third variable)
        int temp;
        temp=a[b];
        a[b]=a[c];
        a[c]=temp;
//        M-2 (without using a third variable)
        /*a[b]=a[b]+a[c];
        a[c]=a[b]-a[c];
        a[b]=a[b]-a[c];*/
//        M-3 (using bitwise operators)
        /*a[b]=a[b]^a[c];
        a[c]=a[b]^a[c];
        a[b]=a[b]^a[c];*/
    }
}
