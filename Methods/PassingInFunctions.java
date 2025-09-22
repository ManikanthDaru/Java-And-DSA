import java.util.Arrays;

public class PassingInFunctions {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5};
        System.out.println(Arrays.toString(a));
        change(a);
        System.out.println(Arrays.toString(a));
    }
    public static void change(int[] b) {
        b[0]=10;
    }
}
