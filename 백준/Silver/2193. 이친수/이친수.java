import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    int n = Integer.parseInt(br.readLine());
    long[] dp = new long[100];
    dp[1] = 1L;
    dp[2] = 1L;
    for(int i=3;i<100;i++){
      dp[i] = dp[i-1] + dp[i-2]; 
    }
    sb.append(dp[n]);
    bw.write(sb.toString());
    bw.flush();
    br.close();
    bw.close();
  }
}
