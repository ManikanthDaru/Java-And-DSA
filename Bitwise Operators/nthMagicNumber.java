import java.util.Scanner;

public class nthMagicNumber {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int pval=5,ans=0;
        for(int i=0;i<31;i++) {
            if(((n>>i)&1)==1) ans+=pval;
            pval*=5;
        }
        System.out.println(ans);
    }
}
