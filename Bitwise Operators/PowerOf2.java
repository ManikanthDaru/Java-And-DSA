import java.util.Scanner;

public class PowerOf2 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        System.out.println(method1(n));
        System.out.println(method2(n));
    }
    static boolean method1(int n) {
        int count=0;
        while(n>0) {
            if(n%2!=0) count++;
            n/=2;
        }
        if(count==1) return true;
        return false;
    }
    static boolean method2(int n) {
        return ((n&(n-1))==0) && n!=0;
    }
}
