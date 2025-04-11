import java.io.*;

public class Main{
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        while (true) {
            int n = Integer.parseInt(br.readLine());
            if(n==-1) break;

            int sum = 1;
            sb.append(n).append(" = 1");
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    sb.append(" + ").append(i);
                    sum += i;
                }
            }
            if (sum == n) {
                sb.append("\n");
                bw.write(sb.toString());
                sb.setLength(0);
            } else {
                sb.setLength(0);
                sb.append(n).append(" is NOT perfect.\n");
                bw.write(sb.toString());
                sb.setLength(0);
            }

        }

        bw.flush();
    }
}
