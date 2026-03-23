import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    int n = Integer.parseInt(br.readLine());
    int[][] arr = new int[1001][4];
    
    
    for(int i=1;i<=n;i++){
      StringTokenizer st = new StringTokenizer(br.readLine());  
      arr[i][1] = Integer.parseInt(st.nextToken());
      arr[i][2] = Integer.parseInt(st.nextToken());
      arr[i][3] = Integer.parseInt(st.nextToken());
    }
    int[][] dp = new int[1001][4];
    dp[1][1] = arr[1][1];
    dp[1][2] = arr[1][2];
    dp[1][3] = arr[1][3];
        
    for(int i=2;i<=n;i++){
      for(int j=1;j<=3;j++){
        int min = Integer.MAX_VALUE;
        int sum = 0;
        for(int k=1;k<=3;k++){
          if(k==j) continue;
          sum = dp[i-1][k] + arr[i][j];
          min = Math.min(min,sum);
        }
        dp[i][j] = min;
      }
    }
    
    sb.append(Math.min(Math.min(dp[n][1],dp[n][2]),dp[n][3]));
    bw.write(sb.toString());
    bw.flush();
    br.close();
    bw.close();
  }
}

