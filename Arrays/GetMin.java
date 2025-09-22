import java.util.Scanner;

public class GetMin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Size of the array is:");
        int n = input.nextInt();
        System.out.println("Input the elements of the array:");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println("The minimum element of the array is:");
        System.out.println(min(arr));
        ;
    }
    public static int min(int[] a) {
        int min=a[0];
        for(int i=1;i<a.length;i++) {
            if(a[i]<min) {
                min=a[i];
            }
        }
        return min;
    }
}
