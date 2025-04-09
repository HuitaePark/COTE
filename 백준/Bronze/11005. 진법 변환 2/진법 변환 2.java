import java.util.*;
import java.io.*;

public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

         while(N > 0) {
            int n = N % B;
            if (n >= 10) {
                sb.append((char)(n + 55));
            } else {
                sb.append(n);
            }
            N /= B;
        }


        bw.write(sb.reverse().toString());
        bw.flush();
    }
}
