import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
/*//        Implicit type conversion
        Scanner input=new Scanner(System.in);
        float a=input.nextInt();
        System.out.println(a);
//        Explicit type conversion or typecasting
        int b=(int)input.nextFloat();
        System.out.println(b);
        byte c=(byte)257;
        System.out.println(c); //c=257%256=1
//        Java takes any short or byte as int by default in mathematical expressions
        byte a=10;
        byte b=100;
        byte c=125;
        byte d=(byte)(a*b/c);
        System.out.println(d);
        byte e=20;
        e *= (byte) 200;
        System.out.println(e);
        int f='a';
        System.out.println(f);
//        If an expression is containing at least one float value or double value or
//        long value then the entire expression is converted into them
        System.out.println(2.1*2.1f);*/
//        Celsius to Fahrenheit conversion and vice-versa
//        1.C to F:-   F=(9*C)/5+32
//        2.F to C:-   C=(5*(F-32))/9
        Scanner input=new Scanner(System.in);
//        float C=input.nextFloat();
//        float F=(9*C)/5 +32;
//        System.out.println(F);
        float F=input.nextFloat();
        float C=5*(F-32)/9;
        System.out.println(C);
    }
}
