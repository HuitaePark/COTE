import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    int n = Integer.parseInt(br.readLine());
    int[][] arr = new int[n][n];
    int[][] dp = new int[n][n];

    int count=1;
    for(int i=0;i<n;i++){
      StringTokenizer st = new StringTokenizer(br.readLine());
      for(int j=0;j<count;j++){
        arr[i][j] = Integer.parseInt(st.nextToken());
      }
      count++;
    }

    dp[0][0] = arr[0][0];
    
    count = 2;
    for(int i=1;i<n;i++){
      for(int j=0;j<count;j++){
        if(j==0) dp[i][j] = dp[i-1][j]+arr[i][j];
        else if(j==count-1) dp[i][j] = dp[i-1][j-1]+arr[i][j];
        else dp[i][j] = Math.max(dp[i-1][j-1]+arr[i][j],dp[i-1][j]+arr[i][j]);
      }
      count++;
    }

    int max = Integer.MIN_VALUE;
    for(int i=0;i<n;i++){
      if(dp[n-1][i]>max) max = dp[n-1][i];
    }
    sb.append(max);
    bw.write(sb.toString());
    bw.flush();
    br.close();
    bw.close();
  }
}
