import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        print(1,n);
    }

    static void print(int i, int n ) {
        if(i>n) return;
        System.out.println(i);
        print(i+1, n);
    }
}
