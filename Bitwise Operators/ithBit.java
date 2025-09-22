import java.util.Scanner;

public class ithBit {
    public static void main(String[] args) {
        int a=1000000;
        int b=10000000;
        int c=a*b;
        long d=(long)a*b;
        System.out.println(a*b);
        System.out.println(c);
        System.out.println(d%(1L<<32));
        int e=10;
        System.out.println(~e);
        System.out.println(~0);
        System.out.println(10&(~10+1));
        Scanner in=new Scanner(System.in);
        int i=in.nextInt();
        int j=in.nextInt();
        System.out.println(checkSetBit(i,j));
    }
    static boolean checkSetBit(int i,int j) {
        return ((i&(1<<j))==(1<<j));
//        return ((i&(1<<j))!=0);
//        return (((i>>j)&1)==1);
//        return ((i>>j)%2!=0);
    }
}
