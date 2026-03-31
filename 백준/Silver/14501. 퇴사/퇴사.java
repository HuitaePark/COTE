import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    int n = Integer.parseInt(br.readLine());

    int[] t = new int[n+1];
    int[] p = new int[n+1];
        
    for (int i=1;i<=n;i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      t[i] = Integer.parseInt(st.nextToken());
      p[i] = Integer.parseInt(st.nextToken());
    }

    int[] dp = new int[n+2];
    for(int i=1;i<=n;i++){
      dp[i+1] = Math.max(dp[i+1], dp[i]);
      int nextDay = i+t[i];
      if(nextDay <= n+1) dp[nextDay] = Math.max(dp[nextDay],dp[i]+p[i]);
    }
    
    sb.append(dp[n+1]);
    bw.write(sb.toString());
    bw.flush();
    br.close();
    bw.close();
  }
}
