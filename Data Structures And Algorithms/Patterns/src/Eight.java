import java.io.*;

public class Eight {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for(int i=0;i<n;i++) {
            for(int j=0;j<i;j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <2*(n-i-1)+1; j++) {
                System.out.print("*");
            }
            for(int j=0;j<i;j++) { // 0 - 3, 1 - 3 spaces
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
