//Time Complexity:- O(logn)
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int k=input.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++) {
            arr[i]=input.nextInt();
        }
        int index=binarysearch(arr,n,k);
        System.out.println(index);
    }
    static int binarysearch(int[] arr,int n,int target) {
        if(n==0) return -1;
        int start=0,end=n-1;
        while(start<=end) {
            int mid=(start)+(end-start)/2;
            if(target>arr[mid]) start=mid+1;
            else if(target<arr[mid]) end=mid-1;
            else return mid;
        }
        return -1;
    }
}
