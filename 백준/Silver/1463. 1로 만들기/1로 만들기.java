import java.util.*;
import java.io.*;
  
public class Main{
  
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    int n = Integer.parseInt(br.readLine());
    int[] dp = new int[1000001];
    dp[1] = 0;

    for(int i=2;i<dp.length;i++){
      dp[i] = dp[i-1]+1;
      if(i%2==0) dp[i] = Math.min(dp[i/2]+1,dp[i]);
      if(i%3==0) dp[i] = Math.min(dp[i/3]+1,dp[i]);
    }
    
    sb.append(dp[n]);
    bw.write(sb.toString());
    bw.flush();
  }
}
