import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    
    int n = Integer.parseInt(br.readLine());
    int[] arr = new int[n+1];
    int[] dp = new int[301];
    for(int i = 1;i<=n;i++){
      arr[i] = Integer.parseInt(br.readLine());
    }
    
    dp[1] = arr[1];
    
    if(n==1){
      sb.append(dp[1]);
    }
    else if(n==2){
      dp[2] = arr[1]+arr[2];
      sb.append(dp[2]);
    }
    else{
      dp[2] = arr[1]+arr[2];
      for(int i = 3;i<=n;i++){
        dp[i] = Math.max(dp[i-2]+arr[i],dp[i-3]+arr[i-1]+arr[i]);
      }
      
      sb.append(dp[n]);
    }


    bw.write(sb.toString());
    bw.flush();
  
  }
}
