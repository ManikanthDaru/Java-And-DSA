package Basics.src;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int rows,cols,spaces,n;
        Scanner input=new Scanner(System.in);
        n=input.nextInt();
        for(rows=1;rows<=2*n-1;rows++) {
            if(rows<=n) {
                for(spaces=1;spaces<=rows-1;spaces++) {
                    System.out.print(" ");
                }
                for(cols=rows;cols<=n;cols++) {
                    System.out.print(cols);
                    System.out.print(" ");
                }
            }
            else {
                for(spaces=1;spaces<=5-rows+n;spaces++) {
                    System.out.print(" ");
                }
                for(cols=n+6-rows;cols<=n;cols++) {
                    System.out.print(cols);
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}