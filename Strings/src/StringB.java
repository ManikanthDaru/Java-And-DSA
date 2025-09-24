package Strings.src;

public class StringB {
    public static void main(String[] args) {
        StringBuilder str1= new StringBuilder();
        StringBuilder str2=new StringBuilder();
        str2.append("Manikanth Daru");
        for(int i=0;i<26;i++) {
            char ch=(char)('a'+i);
            str1.append(ch);
        }
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str1.reverse());
        System.out.println(str1); //mutability of strings can be seen here
        System.out.println(str1.delete(0,1));
        System.out.println(str1.compareTo(str2));
        System.out.println('y'-'M');
    }
}
