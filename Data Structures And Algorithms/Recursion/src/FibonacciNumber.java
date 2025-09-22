import java.util.Scanner;
// multiple recursion calls
// TC - O(2^N), SC - O(2^N)
public class FibonacciNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(fib(n));
    }

    static int fib(int n) {
        if(n<=1) return n;
        return fib(n-1) + fib(n-2);
    }
}
