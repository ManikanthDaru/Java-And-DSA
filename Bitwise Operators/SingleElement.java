import java.util.Scanner;

public class SingleElement {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++) {
            arr[i]=in.nextInt();
        }
        int res=0;
        for(int i=0;i<n;i++) {
            res=res^arr[i];
        }
        System.out.println(res);
    }
}
