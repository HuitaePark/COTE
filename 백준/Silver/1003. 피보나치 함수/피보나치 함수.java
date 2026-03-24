import java.util.*;
import java.io.*;
  
public class Main{
static Integer[][] dp = new Integer[41][2];
    public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
      StringBuilder sb = new StringBuilder();
      int[][] dp = new int[41][2];
      //0은 0의 개수 1은 1의 개수
      dp[0][0] = 1;
      dp[0][1] = 0;
      
      dp[1][0] = 0;
      dp[1][1] = 1;

      
      for(int i=2;i<dp.length;i++){
        dp[i][0] = dp[i-1][0] + dp[i-2][0];
        dp[i][1] = dp[i-1][1] + dp[i-2][1];
      }
      
      int t = Integer.parseInt(br.readLine());
      for(int i=0;i<t;i++){
        int current = Integer.parseInt(br.readLine());
        sb.append(dp[current][0]).append(" ").append(dp[current][1]).append("\n");
      }
      bw.write(sb.toString());
      bw.flush();
      bw.close();
      br.close();
    }
}

