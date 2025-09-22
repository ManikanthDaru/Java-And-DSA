import java.util.Arrays;
import java.util.Scanner;

public class SearchingIn2DArray {
    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        Scanner input=new Scanner(System.in);
        int m=input.nextInt();
        int n=input.nextInt();
        int t=input.nextInt();
        int[][] arr=new int[m][n];
        for(int i=0;i<arr.length;i++) {
            for(int j=0;j<arr[i].length;j++) {
                arr[i][j]=input.nextInt();
            }
        }
        int ans[]=search(arr,t);
        System.out.println(Arrays.toString(ans));
        System.out.println(max(arr));
        System.out.println(min(arr));
    }
    static int[] search(int[][] arr,int target) {
        if(arr.length==0) {
            return new int[] {0,0} ;
        }
        for(int i=0;i<arr.length;i++) {
            for(int j=0;j<arr[i].length;j++) {
                if(arr[i][j]==target) {
                    return new int[] {i,j};
                }
            }
        }
        return new int[] {-1,-1};
    }
    static int max(int[][] arr) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++) {
            for(int j=0;j<arr[i].length;j++) {
                if(arr[i][j]>max) {
                    max=arr[i][j];
                }
            }
        }
        return max;
    }
    static int min(int[][] arr) {
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++) {
            for(int j=0;j<arr[i].length;j++) {
                if(arr[i][j]<min) {
                    min=arr[i][j];
                }
            }
        }
        return min;
    }
}
