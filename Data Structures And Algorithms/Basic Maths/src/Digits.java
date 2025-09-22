import java.io.*;
// print all digits in a number
public class Digits {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        bw.write(n+"\n");
        int count = 0;
        String str="";
        while(n>0) {
            int rem = n % 10;
            bw.write(rem + " ");
            str = str + "" + rem;
            n /= 10;
            count++;
        }
        int reversedNum = Integer.parseInt(str);
        bw.write("\n"+count);
        bw.close();
    }
}
