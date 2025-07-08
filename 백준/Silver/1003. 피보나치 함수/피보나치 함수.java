import java.util.*;
import java.io.*;
  
public class Main{
static Integer[][] dp = new Integer[41][2];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        // DP 테이블의 초기값 설정
        dp[0][0] = 1; // N=0일 때, 0은 1번, 1은 0번
        dp[0][1] = 0;
        dp[1][0] = 0; // N=1일 때, 0은 0번, 1은 1번
        dp[1][1] = 1;

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            
            for (int j = 2; j <= N; j++) {
                if (dp[j][0] == null) {
                    dp[j][0] = dp[j-1][0] + dp[j-2][0];
                    dp[j][1] = dp[j-1][1] + dp[j-2][1];
                }
            }
            sb.append(dp[N][0]).append(" ").append(dp[N][1]).append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}

