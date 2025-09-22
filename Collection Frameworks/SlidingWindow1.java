import java.util.Scanner;

public class SlidingWindow1 {
    public static void main(String[] args) {
//        1. To find the maximum sum of all sub-arrays of size K:
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int k=input.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++) {
            arr[i]=input.nextInt();
        }
        int max_sum=MaxSum2(arr,n,k);
        System.out.println(max_sum);
    }
//    Sliding Window Approach:
//    Time Complexity:O(n)
    static int MaxSum2(int[] arr,int n,int k) {
        int max_sum=0;
        for(int i=0;i<k;i++) {
            max_sum+=arr[i];
        }
        int current_sum=max_sum;
        for(int i=k;i<n;i++) {
            current_sum=current_sum-arr[i-k]+arr[i];
            max_sum=Math.max(current_sum,max_sum);
        }
        return max_sum;
    }
//    Naive Approach or Brute Force Approach:
//    Time Complexity:O(n*k)
    static int MaxSum1(int[] arr,int n,int k) {
        int max_sum=Integer.MIN_VALUE;
        for(int i=0;i<n-k+1;i++) {
            int current_sum=0;
            for(int j=0;j<k;j++) {
                current_sum+=arr[i+j];
            }
            max_sum=Math.max(max_sum,current_sum);
        }
        return max_sum;
    }
}
