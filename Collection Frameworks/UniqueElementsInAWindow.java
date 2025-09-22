//Time Complexity:- O(n^2)
import java.util.*;

public class UniqueElementsInAWindow {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int k=input.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++) {
            arr[i]=input.nextInt();
        }
        uniquew(arr,n,k);
    }
    static void uniquew(int[] arr,int n,int k) {
        for(int i=0;i<n-k+1;i++) {
            HashSet<Integer> set=new HashSet<>();
            for(int j=i;j<i+k;j++) {
                set.add(arr[j]);
            }
            Iterator<Integer> it=set.iterator();
            while(it.hasNext()) {
                System.out.print(it.next());
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
