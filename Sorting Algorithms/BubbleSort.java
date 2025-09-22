import java.util.*;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++) {
            arr[i]=input.nextInt();
        }
        bubblesort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubblesort(int[] arr) {
        int n=arr.length;
//        outer for loop->for n-1 passes
        for(int i=0;i<n-1;i++) {
            boolean swapped=false;
//            inner for loop->for n-i-1 checkings in each pass
            for(int j=0;j<n-i-1;j++) {
                if(arr[j]>arr[j+1]) {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swapped=true;
                }
            }
            if(!swapped) {
                break;
            }
        }
    }
}
