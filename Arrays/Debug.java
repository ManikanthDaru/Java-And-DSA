import java.util.*;

public class Debug {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        Scanner input=new Scanner(System.in);
        String str1=input.next();
        char[] arr=str1.toCharArray();
        int sum=0;
        for(int i=0;i<str1.length();i++) {
            int base=(int)(arr[i])-48;
            sum=sum+(int)Math.pow(base,str1.length());
        }
        String str2=sum+"";
        System.out.println(str1);
        System.out.println(str2);
        if(str1.equals(str2)) System.out.println("Yes");
        else System.out.println("No");
    }
}