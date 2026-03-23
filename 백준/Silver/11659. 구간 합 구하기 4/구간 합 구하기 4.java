import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
      StringBuilder sb = new StringBuilder();
      StringTokenizer st = new StringTokenizer(br.readLine());
      int n = Integer.parseInt(st.nextToken());
      int m = Integer.parseInt(st.nextToken());
      int[] arr = new int[n+1];
      int[] dp = new int[n+1];
      st = new StringTokenizer(br.readLine());
      for(int i=1;i<=n;i++){
        arr[i] = Integer.parseInt(st.nextToken());
      }

      dp[1] = arr[1];

      for(int i=2;i<=n;i++){
        dp[i] = dp[i-1] + arr[i];
      }
      
      for(int i=0;i<m;i++){
        st = new StringTokenizer(br.readLine());
        int start = Integer.parseInt(st.nextToken());
        int end = Integer.parseInt(st.nextToken());
        sb.append(dp[end]-dp[start-1]).append("\n");
      }
      
      bw.write(sb.toString());
      bw.flush();
    }
}
