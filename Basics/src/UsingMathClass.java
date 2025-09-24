package Basics.src;

import java.util.Scanner;
// The Math class in Java does not require explicit importing because it belongs to the java.lang package.
// The java.lang package is automatically imported into every Java program by default.
public class UsingMathClass {
    public static void main(String[] args) {
        System.out.println(Math.PI);
        System.out.println(Math.E);

        double result1 = Math.pow(5,-1);
        System.out.println(result1);
        double result2 = Math.sqrt(10);
        System.out.println(result2);
        int result3 = Math.abs(-189);
        System.out.println(result3);
        int result4 = Math.round(3.14f);
        System.out.println(result4);
        double result5 = Math.ceil(3.14);
        System.out.println(result5);
        double result6 = Math.floor(3.14);
        System.out.println(result6);
        System.out.println(Math.max(-123,-122));

//        finding hypotenuse
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length of side A: ");
        double a = in.nextDouble();
        System.out.println("Enter the length of side B: ");
        double b = in.nextDouble();
        double c = Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
        System.out.println("The length of side C is: "+c);

//        finding circumference, area, volume
        System.out.println("Enter the radius: ");
        double r = in.nextDouble();
        double circumference = 2* Math.PI *r;
        System.out.println("The circumference of the circle is: "+circumference+"cm");
        double area = Math.PI * Math.pow(r,2);
        System.out.println("The area of the circle is: "+area+"cm^2");
        double volume = (4.0/3.0)*Math.PI*Math.pow(r,3);
        System.out.printf("The volume of sphere is: %.2fcm^3",volume);
        in.close();
    }
}
