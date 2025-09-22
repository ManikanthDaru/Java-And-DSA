import java.util.Scanner;

public class XORFrom0toa {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        System.out.println(method(a));
    }
    static int method(int a) {
        if(a%4==0) return a;
        if(a%4==1) return 1;
        if(a%4==2) return a+1;
        return 0;
    }
}
