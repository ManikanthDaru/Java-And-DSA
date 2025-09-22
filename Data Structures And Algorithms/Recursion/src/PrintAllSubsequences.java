import java.util.ArrayList;
import java.util.Scanner;
// TC - O(N*2^N), SC - O(N)
public class PrintAllSubsequences {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = in.nextInt();
        }
        subsequences(0,arr,new ArrayList<Integer>());
    }

    static void subsequences(int i,int[] arr, ArrayList<Integer> list) {
        if(i>=arr.length) {
            System.out.println(list);
            return;
        }

//        take
        list.add(arr[i]);
        subsequences(i+1,arr,list);
//        not take
        list.remove(list.size()-1);
        subsequences(i+1,arr,list);

    }
}
