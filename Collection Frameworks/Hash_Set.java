import java.util.*;

public class Hash_Set {
    public static void main(String[] args) {
        HashSet<Integer> set=new HashSet<>();
//        insert
        set.add(1);
        set.add(2);
        System.out.println(set.add(3));
//        size
        System.out.println(set.size());
//        print
        System.out.println(set);
//        delete
        set.remove(2);

//        search
        if(set.contains(2)) System.out.println(true);
        else System.out.println(false);
//        iterate
        Iterator<Integer> it=set.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
