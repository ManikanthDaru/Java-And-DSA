import java.util.Map;
import java.util.HashMap;
import java.util.Set;

public class Hash_Map {
    public static void main(String[] args) {
        Map<Integer,String> fm=new HashMap<>();
        fm.put(Integer.valueOf(1),"Manikanth Daru");
        fm.put(Integer.valueOf(2),"Harshith Kapuluru");
        fm.put(2,"Manikanth Daru");
        fm.remove(1);
        System.out.println(fm);
        if(fm.containsKey(3)) System.out.println(true);
        else System.out.println(false);
        if(fm.containsValue("Manikanth")) System.out.println(true);
        else System.out.println(false);
        System.out.println(fm.get(3));
//        iteration
//        for(int val:arr)
        for(Map.Entry<Integer,String> e: fm.entrySet()) {
            System.out.println(e.getKey()+": "+e.getValue());
        }
        Set<Integer> keys=fm.keySet();
        for(int key:keys) {
            System.out.println(key+": "+fm.get(key));
        }
    }
}
