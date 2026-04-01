import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    StringTokenizer st = new StringTokenizer(br.readLine());
    int t = Integer.parseInt(st.nextToken());
    int w = Integer.parseInt(st.nextToken());
    int[] arr = new int[t];
    for(int i=0;i<t;i++){
      arr[i] = Integer.parseInt(br.readLine());
    }
    int[][] dp = new int[t+1][w+1];
    
    for (int i = 1; i <= t; i++) {
      int plum_pos = arr[i-1]; // i초에 자두가 떨어지는 위치
  
      for (int j = 0; j <= w; j++) {
        // 현재 내 위치 계산 (j가 짝수면 1번, 홀수면 2번)
        int my_pos = (j % 2 == 0) ? 1 : 2;
        int get_plum = (my_pos == plum_pos) ? 1 : 0;
        if (j == 0) {
            // 한 번도 안 움직인 경우는 위에서 내려오는 수밖에 없음
            dp[i][j] = dp[i-1][j] + get_plum;
        } else {
            // 가만히 있었거나(dp[i-1][j]), 방금 이동했거나(dp[i-1][j-1])
            dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-1]) + get_plum;
        }
      }
    }

    int count = 0;
    for(int i=0;i<=w;i++){
      count = Math.max(dp[t][i],count);
    }
    sb.append(count);
    bw.write(sb.toString());
    bw.flush();
    br.close();
    bw.close();
  }
}
