import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    int n = Integer.parseInt(br.readLine());
    int[] arr = new int[n];
    int[] dp = new int[n];
    StringTokenizer st = new StringTokenizer(br.readLine());
    for(int i=0;i<n;i++){
      arr[i] = Integer.parseInt(st.nextToken());
    }

    dp[0] = arr[0];
    int max = dp[0];
    for(int i=1;i<arr.length;i++){
      dp[i] = Math.max(dp[i-1]+arr[i],arr[i]);
      if(dp[i]>max) max = dp[i];
    }

    sb.append(max);
    bw.write(sb.toString());    
    bw.flush();
    br.close();
    bw.close();
  }
}
