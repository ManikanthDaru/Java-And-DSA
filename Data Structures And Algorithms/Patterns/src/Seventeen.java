import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Seventeen {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for(int i=0;i<n;i++) {
            for(int j =0;j<n-i-1;j++) {
                System.out.print(" ");
            }
            char alpha = 'A';
            for (int j = 0; j <= i; j++) {
                System.out.print(alpha);
                alpha = (char)(alpha+1);
            }
            alpha = (char)(alpha-1);
            for (int j = i-1; j >=0; j--) {
                alpha = (char)(alpha-1);
                System.out.print(alpha);
            }
            System.out.println();
        }
    }
}
