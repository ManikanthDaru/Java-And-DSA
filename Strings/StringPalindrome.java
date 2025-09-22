import java.util.Scanner;
public class StringPalindrome {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
//        String str=input.next();
//        System.out.println(ispalindrome(str));
//        M-3
        StringBuilder str=new StringBuilder();
        str.append(input.next());
        String original= String.valueOf(str);
        str.reverse();
        String reversed=String.valueOf(str);
        System.out.println(reversed.equals(original));
    }
    static boolean ispalindrome(String s) {
//        M-1
        /*String buffer="";
        for(int i=0;i<s.length();i++) {
            buffer=buffer+s.charAt(i);
        }
        if(s.equals(buffer)) return true;
        return false;*/
//        M-2
        int start=0,end=s.length()-1;
        while(start<end) {
            if(s.charAt(start)!=s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
