import java.util.Scanner;

public class BSUsingRecursion {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int k=input.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++) {
            arr[i]=input.nextInt();
        }
        int index=binarysearch(arr,k,0,n-1);
        System.out.println(index);
    }
    static int binarysearch(int[] arr,int k,int start,int end) {
        if(start>end) return -1;
        int mid=(start+end)/2;
        if(k==arr[mid]) return mid;
        if(k<arr[mid]) binarysearch(arr,k,start,mid-1);
        return binarysearch(arr,k,mid+1,end);
    }
}
