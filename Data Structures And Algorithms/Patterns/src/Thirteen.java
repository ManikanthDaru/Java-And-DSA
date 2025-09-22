import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Thirteen {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int num = 1;
        for(int i=0;i<n;i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((num++)+" ");
            }
            System.out.println();
        }
    }
}
