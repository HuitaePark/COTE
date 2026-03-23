import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    int n = Integer.parseInt(br.readLine());
    int[][] dp = new int[305][3];
    int[] arr = new int[305];
    for(int i=1;i<=n;i++){
      arr[i] = Integer.parseInt(br.readLine());
    }
    if(n==1){
      System.out.println(arr[1]);
      return;
    }
    dp[1][1] = arr[1];
    dp[1][2] = 0;
    dp[2][1] = arr[2];
    dp[2][2] = arr[1] + arr[2];

    for(int i=3;i<=n;i++){
      dp[i][1] = Math.max(dp[i-2][1],dp[i-2][2])+arr[i];
      dp[i][2] = dp[i-1][1] + arr[i];
   }
    
    sb.append(Math.max(dp[n][1],dp[n][2]));
    bw.write(sb.toString());
    bw.flush();
  
  }
}
