import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    int n = Integer.parseInt(br.readLine());
    long[][] dp = new long[101][10];
    dp[1][0] = 0L;
    for(int i=1;i<=9;i++){
      dp[1][i] = 1L;
    }
    for(int i=2;i<dp.length;i++){
        for(int j=0;j<=9;j++){
          if(j==0) dp[i][0] = dp[i-1][1] % 1000000000L;
          else if(j==9) dp[i][9] = dp[i-1][8] % 1000000000L;
          else dp[i][j] = (dp[i-1][j+1] + dp[i-1][j-1]) % 1000000000L;
        }
    }
    
    long sum = 0;
    for(int i=0;i<=9;i++){
      sum+=dp[n][i];
    }
    sb.append(sum % 1000000000L);
    bw.write(sb.toString());
    bw.flush();
    br.close();
    bw.close();
  }
}
