import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sixteen {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        char alpha = 'A';
        for(int i=0;i<n;i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(alpha+" ");
            }
            alpha = (char)(alpha+1);
            System.out.println();
        }
    }
}
