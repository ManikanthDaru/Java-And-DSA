import java.util.Scanner;

public class FirstAndLastIndex {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int k=input.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++) {
            arr[i]=input.nextInt();
        }
        int index1= firstindex(arr,n,k);
        int index2= secondindex(arr,n,k);
        System.out.println(index1+" "+index2);
    }
    static int firstindex(int[] arr, int n, int target) {
        int ans=-1;
        if(n==0) return -1;
        int start=0,end=n-1;
        while(start<=end) {
            int mid=(start+end)/2;
            if(target>arr[mid]) start=mid+1;
            else if(target<arr[mid]) end=mid-1;
            else {
                ans=mid;
                end=mid-1;
            }
        }
        return ans;
    }
    static int secondindex(int[] arr, int n, int target) {
        int ans=-1;
        if(n==0) return -1;
        int start=0,end=n-1;
        while(start<=end) {
            int mid=(start+end)/2;
            if(target>arr[mid]) start=mid+1;
            else if(target<arr[mid]) end=mid-1;
            else {
                ans=mid;
                start=mid+1;
            }
        }
        return ans;
    }
}
