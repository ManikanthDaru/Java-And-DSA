import java.util.Scanner;

public class ManipulateithBit {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int i=in.nextInt();
        System.out.println(set(n,i));
        System.out.println(unset(n,i));
    }
    static int set(int n,int i) {
        return (n|(1<<i));
    }
    static int unset(int n,int i) {
        return (n&(~(1<<i)));
    }
}
