import java.util.Scanner;

public class PatternProblems {
    public static void main(String[] args) {
        pattern16();
//        pattern15();
//        pattern14();
//        pattern13();
//        pattern12();
//        pattern9();
        /*int rows,cols,spaces;
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        for(rows=1;rows<=n;rows++) {
            for(spaces=1;spaces<=rows-1;spaces++) {
                System.out.print(" ");
            }
            for(cols=1;cols<=n-rows+1;cols++) {
                System.out.print("* ");
            }
            System.out.println();
        }*/
        /*int i,j,n;
        Scanner input=new Scanner(System.in);
        n=input.nextInt();
//        int m=n;
        for(i=1;i<=(2*n)-1;i++) {
            if(i<=n) {
                for(j=1;j<=i;j++) {
                    System.out.print("* ");
                }
            }
            else {
                for(j=1;j<=2*n-i;j++) {
                    System.out.print("* ");
                }*/
                /*for(j=1;j<=m-1;j++) {
                    System.out.print("* ");
                }
                m--;
            }
            System.out.println();
        }*/
        /*int i,j,n;
        Scanner input=new Scanner(System.in);
        n=input.nextInt();
        for(i=1;i<=n;i++) {
            for(j=1;j<=n+1-i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }*/
        /*int i,j;
        for(i=0;i<5;i++) {
            for(j=0;j<5;j++) {
                System.out.print("*");
            }
            System.out.println();
        }*/
    }
    public static void pattern16() {
        int rows,cols,spaces,n;
        Scanner input=new Scanner(System.in);
        n=input.nextInt();
        for(rows=1;rows<=n;rows++) {
            for(spaces=1;spaces<=n-rows;spaces++) {
                System.out.print(" ");
            }
            for(cols=1;cols<=rows;cols++) {
                System.out.print(factorial(rows-1)/(factorial(rows-cols)*factorial(cols-1)));
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static int factorial(int n) {
        if(n==0) {
            return 1;
        }
        return n*factorial(n-1);
    }
    public static void pattern15() {
        int rows, cols, spaces, n;
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        for (rows = 1; rows <= 2 * n - 1; rows++) {
            if (rows <= n) {
                for (spaces = 1; spaces <= n - rows; spaces++) {
                    System.out.print(" ");
                }
                for (cols = 1; cols <= 2 * rows - 1; cols++) {
                    if (cols == 1 || cols == 2 * rows - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            } else {
                for (spaces = 1; spaces <= rows - n; spaces++) {
                    System.out.print(" ");
                }
                for (cols = 1; cols <= 9 - 2 * (rows - n); cols++) {
                    if (cols == 1 || cols == 9 - 2 * (rows - n)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
        public static void pattern14() {
        int rows,cols,spaces,n;
        Scanner input=new Scanner(System.in);
        n=input.nextInt();
        for(rows=1;rows<=n;rows++) {
            for(spaces=1;spaces<=rows-1;spaces++) {
                System.out.print(" ");
            }
            if(rows==1) {
                for(cols=1;cols<=11-(2*rows);cols++) {
                    System.out.print("*");
                }
            }
            else {
                for(cols=1;cols<=11-(2*rows);cols++) {
                    if(cols==1 || cols==11-(2*rows)) {
                        System.out.print("*");
                    }
                    else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
    public static void pattern13() {
        int rows,cols,spaces,n;
        Scanner input=new Scanner(System.in);
        n=input.nextInt();
        for(rows=1;rows<=n;rows++) {
            for(spaces=1;spaces<=n-rows;spaces++) {
                System.out.print(" ");
            }
            if(rows==n) {
                for(cols=1;cols<=2*rows-1;cols++) {
                    System.out.print("*");
                }
            }
            else {
                for(cols=1;cols<=2*rows-1;cols++) {
                    if(cols==1 || cols==2*rows-1) {
                        System.out.print("*");
                    }
                    else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
    public static void pattern12() {
        int rows,cols,n,spaces;
        Scanner input=new Scanner(System.in);
        n=input.nextInt();
        for(rows=1;rows<=2*n;rows++) {
            if(rows<=n) {
                for(spaces=1;spaces<=rows-1;spaces++) {
                    System.out.print(" ");
                }
                for(cols=1;cols<=n-rows+1;cols++) {
                    System.out.print("* ");
                }
            }
            else {
                for(spaces=1;spaces<=(2*n)-rows;spaces++) {
                    System.out.print(" ");
                }
                for(cols=1;cols<=rows-n;cols++) {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
    public static void pattern9() {
        int rows,cols,spaces,n;
        Scanner input=new Scanner(System.in);
        n=input.nextInt();
        for(rows=1;rows<=n;rows++) {
            for(spaces=1;spaces<=rows-1;spaces++) {
                System.out.print(" ");
            }
            for(cols=1;cols<=(2*n)-(2*rows)+1;cols++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}