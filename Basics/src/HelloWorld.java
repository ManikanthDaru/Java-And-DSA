package Basics.src;

// importing Scanner class from java.util package
import java.util.Scanner;

public class HelloWorld {
//    This is a single line comment.
    /*
    This is
    a multi-line comment.
     */

//    .java->extension for java source code files

//    public(keyword)->it means that the class/method/variable can be accessed from anywhere (outside or inside the package)
//    main function->entry point of the program
//    psvm-public static void main(String[] args){}
//    sout-System.out.println();
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.print("Hello World!\n");
        System.out.print("Hello World!");
        System.out.println();

        Scanner input=new Scanner(System.in);
        System.out.println(input.nextLine());
        System.out.println(input.nextLine());
        System.out.println(input.nextInt()); // if you give different input you will get Exception in thread "main" java.util.InputMismatchException
    }
}
