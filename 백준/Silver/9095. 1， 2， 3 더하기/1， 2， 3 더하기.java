import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    int n = Integer.parseInt(br.readLine());
    int[] dp = new int[12];
    dp[1]=1;
    dp[2]=2;
    dp[3]=4;
    for(int i=4;i<dp.length;i++){
      dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
    }
    for(int i=0;i<n;i++){
      sb.append(dp[Integer.parseInt(br.readLine())]).append("\n");
    }
    bw.write(sb.toString());
    bw.flush();
  }
}
