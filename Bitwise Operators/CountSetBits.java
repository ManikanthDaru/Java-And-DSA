import java.util.Scanner;

public class CountSetBits {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        System.out.println(Integer.toBinaryString(n));
        System.out.println(method1(n));
        System.out.println(method2(n));
    }
    static int method1(int n) {
        int count=0;
        for(int i=0;i<31;i++) {
            if(n%2==1) count++;
            n/=2;
        }
        return count;
    }
    static int method2(int n) {
        int count=0;
        while(n>0) {
            n=n&(n-1);
            count++;
        }
        return count;
    }
}
