import java.util.Arrays;
import java.util.Scanner;

public class SearchInString {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
//        String str="Manikanth Daru";
        String str=input.nextLine();
        char ch=(input.next()).charAt(0);
        System.out.println(search(str,ch));
        System.out.println(Arrays.toString(str.toCharArray()));
    }
    static boolean search(String str,char target) {
        if(str.isEmpty()) {
            return false;
        }
        for(char ch:str.toCharArray()) {
            if(ch==target) {
                return true;
            }
        }
        /*for(int i=0;i<str.length();i++) {
            if(str.charAt(i)==target) {
                return true;
            }
        }*/
        return false;
    }
}
