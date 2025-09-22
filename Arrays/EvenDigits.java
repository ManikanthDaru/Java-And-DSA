import java.util.Scanner;

public class EvenDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Size of the array is:");
        int n = input.nextInt();
        System.out.println("Input the elements of the array:");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println("The number of even digits elements are:");
        System.out.println(count(arr));
        System.out.println("The number of odd digits elements are:");
        System.out.println(arr.length-count(arr));
    }
    static int count(int[] arr) {
        int count=0;
        for(int nums:arr) {
            if(even(nums)) {
                count++;
            }
        }
        return count;
    }
    static boolean even(int n) {
//        M-1
        /*String s=n+" ";
        if(s.length()%2==0) {
            return true;
        }
        return false;*/
//        M-2
//        if(n<=0) n=n*-1;
        /*if(n==0) return false;
        int count=0;
        while(n!=0) {
            n=n/10;
            count++;
        }
        if(count%2==0) return true;
        return false;*/
//        M-3
        if(n<=0) n=n*-1;
        int count=(int)(Math.log10(n))+1;
        if(count%2==0) return true;
        return false;
    }
}
