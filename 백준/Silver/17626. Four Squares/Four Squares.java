import java.util.*;
import java.io.*;
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    int n = Integer.parseInt(br.readLine());
    int[] dp = new int[50001];

    
  

    for(int i = 1;i<=50000;i++){
      dp[i] = i;
      
      for(int j = 1;j*j<=i;j++){
        dp[i] = Math.min(dp[i],dp[i-j*j]+1);
      }
    }
    
    sb.append(dp[n]);




     bw.write(sb.toString());
     bw.flush();
  
  }
}