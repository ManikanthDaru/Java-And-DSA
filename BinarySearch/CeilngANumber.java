import java.util.Scanner;
import java.util.Arrays;

public class CeilngANumber {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int k=input.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++) {
            arr[i]=input.nextInt();
        }
        Arrays.sort(arr);
        int index=ceiling(arr,n,k);
        if(index!=-1) System.out.println(arr[index]);
        else System.out.println(-1);
    }
    static int ceiling(int[] arr,int n,int target) {
        if(n==0) return -1;
        if(target>arr[n-1]) return -1;
        int start=0,end=n-1;
        while(start<=end) {
            int mid=(start+end)/2;
            if(target>arr[mid]) start=mid+1;
            else if(target<arr[mid]) end=mid-1;
            else return mid;
        }
        return start;
    }
}
