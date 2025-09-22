import java.util.Scanner;

public class SmallestLetter {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        char k=input.next().charAt(0);
        String s=input.next();
        char[] arr=s.toCharArray();
        int index=smallest(arr,k);
        if(index!=-1) System.out.println(arr[index]);
        else System.out.println(-1);
    }
    static int smallest(char[] arr,char target) {
        if(arr.length==0) return -1;
        if(target>=arr[arr.length-1]) return 0;
        int start=0,end=arr.length-1;
        while(start<=end) {
            int mid=(start+end)/2;
            if(target<arr[mid]) end=mid-1;
            else start=mid+1;
        }
        return start;
    }
}
