import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Size of the array is:");
        int n=input.nextInt();
        System.out.println("Input the elements of the array:");
        int[] arr=new int[n];
        for(int i=0;i<n;i++) {
            arr[i]=input.nextInt();
        }
        System.out.println("Enter the target element:");
        int k=input.nextInt();
        System.out.println("Enter the range to search the target element:");
        int a=input.nextInt();
        int b=input.nextInt();
        int ans=linearsearch(arr,k,a,b);
        if(ans==-1) System.out.println("Element not found in the array!");
        else if(ans==0) System.out.println("Array is empty");
        else System.out.println("Element found at index- "+ans);
    }
    public static int linearsearch(int[] a,int target,int start,int end) {
//        if the array is empty then return 0
        if(a.length==0) {
            return 0;
        }
//        here for loop is used to check every element of the array whether it is=target or not
        for(int index=start;index<end+1;index++) {
            if(a[index]==target) {
                return index;
            }
        }
//        if the target is not found then return -1
        return -1;
    }
}
