import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
//        Syntax:-
//        ArrayList<data_type> var_name=new ArrayList<>();
//        here,you cannot add primitive datatypes we can add only wrapper classes
        ArrayList<Integer> numbers=new ArrayList<>();
        for(int i=0;i<5;i++) {
            numbers.add(i);
        }
        for(int i=0;i<5;i++) {
            System.out.println(numbers.get(i));;
        }
        String str="";
        str.toCharArray();
        /*numbers.add(100);
        System.out.println(numbers.get(0));
        numbers.add(0,101);
        System.out.println(numbers.get(0));
        System.out.println(numbers);
        numbers.set(1,99);
        System.out.println(numbers);*/
    }
}
