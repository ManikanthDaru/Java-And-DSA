public class Print1to5_Recursive {
    public static void main(String[] args) {
        method1(1);
    }
    static void method1(int n) {
        System.out.println(n);
        if(n==5) return;
//        this is called tail recursion
//         the recursive call is the last operation performed by the function before it returns
        method1(n+1);
    }
}
