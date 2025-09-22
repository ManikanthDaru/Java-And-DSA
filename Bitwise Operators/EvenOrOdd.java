import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
//        M-1
        if(n%2==0) System.out.println("Even Number");
        else System.out.println("Odd Number");
//        M-2
        if((n&1)==0) System.out.println("Even Number");
        else System.out.println("Odd Number");
    }
}
