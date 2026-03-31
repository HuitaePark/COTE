import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    int n = Integer.parseInt(br.readLine());
    long[] dp =  new long[101];
    dp[1] = 1L;
    dp[2] = 1L;
    dp[3] = 1L;
    for(int i=4;i<=100;i++){
      dp[i] = dp[i-2] + dp[i-3];
    }
    for(int i=0;i<n;i++){
      int current = Integer.parseInt(br.readLine());
      sb.append(dp[current]).append("\n");
    }
    bw.write(sb.toString());
    bw.flush();
  }
}
