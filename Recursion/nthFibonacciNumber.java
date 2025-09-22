import java.util.Scanner;

public class nthFibonacciNumber {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        System.out.println(fib(n));
    }
    static int fib(int n) { //n=10
        if(n==0 || n==1) return n;
        return fib(n-1)+fib(n-2);
    }
}
