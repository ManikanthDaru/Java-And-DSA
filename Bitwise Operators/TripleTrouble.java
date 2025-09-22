import java.util.Scanner;

public class TripleTrouble {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++) {
            arr[i]=in.nextInt();
        }
        int ans=0;
        for(int i=0;i<31;i++) {
            int count=0;
            for(int j=0;j<n;j++) {
                if((arr[j]>>i)%2!=0) count++;
            }
            if(count%3!=0) ans=ans|(1<<i);
        }
        System.out.println(ans);
    }
}
