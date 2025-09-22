import java.util.Arrays;
import java.util.Scanner;

public class FlooringANumber {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int k=input.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++) {
            arr[i]=input.nextInt();
        }
        Arrays.sort(arr);
        int index=flooring(arr,n,k);
        if(index!=-1) System.out.println(arr[index]);
        else System.out.println(-1);
    }
    static int flooring(int[] arr,int n,int target) {
        if(n==0 || target<arr[0]) return -1;
        int start=0,end=n-1;
        while(start<=end) {
            int mid=(start)+(end-start)/2;
            if(target>arr[mid]) start=mid+1;
            else if(target<arr[mid]) end=mid-1;
            else return mid;
        }
        return end;
    }
}
