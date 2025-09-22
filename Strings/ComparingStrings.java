import java.util.Arrays;

public class ComparingStrings {
    public static void main(String[] args) {
        String str1="Manikanth"; //using string literal
        String str2=new String("Daru"); //using string class constructor
        String str3=str1+" "+str2;
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str3.length());
        System.out.println(str3.charAt(10));
        String substr1=str1.substring(1,3);
        System.out.println(substr1);
        System.out.println(str1.substring(2));
        String a="Manikanth Daru";
        String b="Manikanth Daru";
//        1. == (Comparing operator)->checks whether the value and the object are same or not
        System.out.println(a==b); //true
        String c=a;
        System.out.println(a==c); //true
//        here in the above case a,b,c are pointing towards the same object
//        i.e "Manikanth Daru"
        String d=new String("Manikanth Daru");
        String e=new String("Manikanth Daru");
        System.out.println(d==e); //false
//        here in the above case a,b are pointing towards different objects having
//        the same value i.e "Manikanth Daru"
//        2. .equals() method >checks only whether the value is same or not
        System.out.println(a.equals(b)); //true
        System.out.println(a.equals(c)); //true
        System.out.println(d.equals(e)); //true
        String lstr=str3.toLowerCase();
        System.out.println(lstr);
        System.out.println(str3.toUpperCase());
        int index=str3.indexOf('d');
        System.out.println(index);
        System.out.println(str3.indexOf(" Daru"));
        System.out.println(str3.indexOf('a',1));
        System.out.println(str3.indexOf("an",2));
        System.out.println(str3.lastIndexOf('a',1));
        String[] name=str3.split(" ");
        System.out.println(Arrays.toString(name));
        System.out.printf("I am \"%s\".\n",str3);
        String rstr=str3.replace('a','*');
        System.out.println(rstr);
        System.out.println(str3.replace("an","ar"));
        System.out.println(str3.replaceAll("an","AN"));
        System.out.println(str3.replaceFirst("an","AN"));
    }
}
