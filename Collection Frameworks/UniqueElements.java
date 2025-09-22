import java.util.*;

public class UniqueElements {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++) {
            arr[i]=input.nextInt();
        }
        unique(arr);
    }
    static void unique(int[] arr) {
        HashSet<Integer> set= new HashSet<>();
        for(int num:arr) {
            set.add(num);
        }
        Iterator<Integer> it=set.iterator();
        while(it.hasNext()) {
            Integer nums=it.next();
            System.out.println(nums);
        }
    }
}
