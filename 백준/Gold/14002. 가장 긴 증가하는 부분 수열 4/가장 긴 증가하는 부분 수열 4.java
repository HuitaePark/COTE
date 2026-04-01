import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    int n = Integer.parseInt(br.readLine());
    int[] arr = new int[n];
    int[] prev = new int[n];
    StringTokenizer st = new StringTokenizer(br.readLine());
    for(int i=0;i<n;i++){
      arr[i] = Integer.parseInt(st.nextToken());
      prev[i] = -1;
    }
    int[] dp = new int[n];
    dp[0] = 1;

    for(int i=1;i<n;i++){
      int current = arr[i];
      int max = 0;
      for(int j=i-1;j>=0;j--){
        if(arr[j]<current){
         if(dp[j] > max) {
              max = dp[j];
              prev[i] = j;
          }
        }
      }
      dp[i] = max+1;
    }
    
    int max = 0;
    int lastIdx = 0;
    for(int i=0;i<dp.length;i++){
      if(dp[i]>max) {
        max = dp[i];
        lastIdx = i;
      }
    }
    sb.append(max).append("\n");
    
    int[] result = new int[max];
    int resultIdx = max - 1;
    
    while(lastIdx != -1) {
        result[resultIdx] = arr[lastIdx]; 
        lastIdx = prev[lastIdx];          
        resultIdx--;
    }

    for(int i=0;i<max;i++){
        sb.append(result[i]).append(" ");
    }

    bw.write(sb.toString());
    bw.flush();
    br.close();
    bw.close();
  }
}
