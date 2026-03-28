import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    int t = Integer.parseInt(br.readLine());
    long[][] dp = new long[35][35];
    
    for (int i = 0; i < 35; i++) {
            dp[i][0] = 1; // nC0 = 1
            dp[i][i] = 1; // nCn = 1
    }
    for (int i = 2; i < 35; i++) {
      for (int j = 1; j < i; j++) {
        dp[i][j] = dp[i-1][j-1] + dp[i-1][j];
      }
    }
    for(int i=0;i<t;i++){
      StringTokenizer st = new StringTokenizer(br.readLine());
      int n = Integer.parseInt(st.nextToken());
      int m = Integer.parseInt(st.nextToken());
      if(n<m){
        int tmp = 0;
        tmp = n;
        n = m;
        m = tmp;
      }
      sb.append(dp[n][m]).append("\n");
    }
    bw.write(sb.toString());
    bw.flush();
    }
}
