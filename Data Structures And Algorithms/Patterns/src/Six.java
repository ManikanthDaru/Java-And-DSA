import java.io.*;

public class Six {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for(int i=0;i<n;i++) {
            for (int j = 0; j <=n-i-1; j++) {
                System.out.print(j+1);
            }
            System.out.println();
        }
    }
}
