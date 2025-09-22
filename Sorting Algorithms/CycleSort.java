import java.util.Arrays;
import java.util.Scanner;

public class CycleSort {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++) {
            arr[i]=input.nextInt();
        }
        cyclesort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void cyclesort(int[] arr) {
        int i=0;
        while(i<arr.length) {
            int index=arr[i]-1;
            if(i!=index) {
                swap(arr,i,index);
            }
            else i++;
        }
    }
    static void swap(int[] arr,int i,int j) {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
