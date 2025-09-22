import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++) {
            arr[i]=input.nextInt();
        }
        selectionsort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selectionsort(int[] arr) {
        int n=arr.length;
        for(int i=0;i<n-1;i++) {
            int firstIndex=i;
            int maxIndex=getMaxIndex(arr,firstIndex,n-1);
            swap(arr,firstIndex,maxIndex);
        }
    }
    static void swap(int[] arr,int i,int j) {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static int getMaxIndex(int[] arr,int start,int end) {
        int max=start;
        for(int i=start+1;i<=end;i++) {
            if(arr[i]<arr[max]) {
                max=i;
            }
        }
        return max;
    }
}
