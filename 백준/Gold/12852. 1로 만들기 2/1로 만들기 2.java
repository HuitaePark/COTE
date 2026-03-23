import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    int n = Integer.parseInt(br.readLine());
    int[] dp = new int[1000001];
    int[] pre = new int[1000001];
    dp[1] = 0;
    pre[1] = 0;
    dp[2] = 1;
    pre[2] = 1;
    
    for(int i=3;i<dp.length;i++){
      dp[i] = dp[i-1]+1;
      pre[i] = i-1;
      if(i%2==0 && dp[i] > dp[i/2]+1){
        dp[i] = dp[i/2]+1;
        pre[i] = i/2;
      }
      if(i%3==0 && dp[i] > dp[i/3]+1){
        dp[i] = dp[i/3]+1;
        pre[i] = i/3;
      }
    }
    
    sb.append(dp[n]).append("\n");
    int cur = n;
    while(cur!=0){
      sb.append(cur).append(" ");
      cur = pre[cur];
    }
    
    bw.write(sb.toString());
    bw.flush();
    br.close();
    bw.close();
  }
}
