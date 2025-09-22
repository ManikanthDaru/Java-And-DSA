import java.util.Scanner;

public class aPowerb {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        System.out.println(method1(a,b));
        System.out.println(method2(a,b));
    }
    static int method1(int a,int b) {
        int ans=1;
        for(int i=0;i<b;i++) {
            ans*=a;
        }
        return ans;
    }
    static int method2(int a,int b) {
        int x=a,ans=1;
        while(b!=0) {
            if(b%2==1) ans*=x;
            b/=2;
            x*=x;
        }
        return ans;
    }
 }
