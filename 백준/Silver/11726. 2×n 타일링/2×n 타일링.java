import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    int[] dp = new int[1001];
    int n = Integer.parseInt(br.readLine());
    dp[1] = 1;
    dp[2] = 2;
    for(int i = 3;i<=1000;i++){
      dp[i] = (dp[i-1] + dp[i-2])%10007;
    }
    sb.append(dp[n]);





     bw.write(sb.toString());
     bw.flush();
  
  }
}