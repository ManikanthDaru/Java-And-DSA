import java.util.Scanner;

public class aPown {
    public static void main(String[] args) {
//        M-2:- Using Recursion
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int n=in.nextInt();
        System.out.println(pow(a,n));
    }
    static int pow(int a,int n) {
        if(n==0) return 1;
        int val=pow(a,n/2);
        if(n%2==0) return val*val;
        else return val*val*a;
    }
}
