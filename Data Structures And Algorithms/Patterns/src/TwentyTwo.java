import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.*;
public class TwentyTwo {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for(int i=0;i<2*n-1;i++) {
            for (int j = 0; j < 2*n-1; j++) {
                int top=i, left = j,right = (2*n-2)-j,bottom = (2*n-2)-i;
                System.out.print(n-Math.min(Math.min(Math.min(top,left),right),bottom));
            }
            System.out.println();
        }
    }
}
