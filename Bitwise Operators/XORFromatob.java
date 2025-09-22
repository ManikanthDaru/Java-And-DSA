import java.util.Scanner;

public class XORFromatob {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        System.out.println(method(b)^method(a-1));
    }
    static int method(int a) {
        if(a%4==0) return a;
        if(a%4==1) return 1;
        if(a%4==2) return a+1;
        return 0;
    }
}
