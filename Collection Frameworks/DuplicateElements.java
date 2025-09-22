import java.util.*;

public class DuplicateElements {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++) {
            arr[i]=input.nextInt();
        }
        duplicate(arr);
    }
    static void duplicate(int[] arr) {
        HashSet<Integer> set=new HashSet<>();
        HashSet<Integer> duplicates=new HashSet<>();
        for(int num:arr) {
            if(!set.add(num)) {
                duplicates.add(num);
            }
        }
        /*Iterator<Integer> it=duplicates.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }*/
        for(Integer num:duplicates) {
            System.out.println(num);
        }
    }
}
