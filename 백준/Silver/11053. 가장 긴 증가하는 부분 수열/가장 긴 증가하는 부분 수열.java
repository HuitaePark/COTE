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

    dp[0] = 1;
    for(int i=1;i<n;i++){
      int current = arr[i];
      int max = 0;
      for(int j=i-1;j>=0;j--){
        if(arr[j]<current) max = Math.max(max,dp[j]);
      }
      dp[i] = max+1;
    }

    int max = 1;
    for(int i=0;i<n;i++){
      max = Math.max(dp[i],max);
    }
    sb.append(max);
    bw.write(sb.toString());
    bw.flush();
    br.close();
    bw.close();
  }
}
