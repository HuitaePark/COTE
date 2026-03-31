import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    int n = Integer.parseInt(br.readLine());
    StringTokenizer st = new StringTokenizer(br.readLine());
    int[] arr = new int[n];
    int[] dp = new int[n];
    for(int i=0;i<n;i++){
      arr[i] = Integer.parseInt(st.nextToken());
    }

    dp[0] = arr[0];
    for(int i=1;i<n;i++){
      int current = arr[i];
      int max = 0;
      for(int j = i-1;j>=0;j--){
        if(arr[j]<current) max = Math.max(max,dp[j]);
      }
      dp[i] = max + current;
    }

    int max = 0;
    for(int i=0;i<arr.length;i++){
      if(dp[i]>max) max = Math.max(dp[i],max);
    }
    sb.append(max);
    bw.write(sb.toString());
    bw.flush();
    br.close();
    bw.close();
  }
}
