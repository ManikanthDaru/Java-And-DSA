package Basics.src;

public class ArithmeticOperators {
    public static void main(String[] args) {

        int a = 10;
        int b = 2;
        int c;

        c = a+b;
        System.out.println(c);
        c = a-b;
        System.out.println(c);
        c = a*b;
        System.out.println(c);
        c = a/b;
        System.out.println(c);
        c = a%b; // modulus operator
        System.out.println(c);

//        Augumented assignment operators
//        a = a+b;
        a += b;
        System.out.println(a);
        a -= b;
        System.out.println(a);
        a *= b;
        System.out.println(a);
        a /= b;
        System.out.println(a);
        a %= b;
        System.out.println(a);

//        increment operators
        System.out.println(b);
        b++;
        b--;
        b++;
        System.out.println(b);

//        Order of operations - [PEMDAS]
//        P - Paranthesis, E - Exponents, M - Multiplication, D - Division, A - Addition, S - Substraction
        double result = 3+4*7-5/2.0; // 3+28-5/2.0 => 3+28-2.5 => 28.5
        System.out.println(result);
    }
}
