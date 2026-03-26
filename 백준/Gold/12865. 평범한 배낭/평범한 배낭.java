import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    int k = Integer.parseInt(st.nextToken());
    
    Bag[] arr = new Bag[n+1];
    int[][] dp = new int[n+1][k+1];
    
    for(int i=0;i<n;i++){
      st = new StringTokenizer(br.readLine());
      int weight = Integer.parseInt(st.nextToken());
      int value = Integer.parseInt(st.nextToken());
      arr[i] = new Bag(weight,value);
    }    

    for(int i=1;i<=n;i++){
      Bag current = arr[i-1];
      for(int j=1;j<=k;j++){
        if(j<current.weight){
          dp[i][j] = dp[i - 1][j];
        }
        else{
          dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-current.weight] + current.value);
        }
      }
    }
    sb.append(dp[n][k]);
    bw.write(sb.toString());
    bw.flush();
    br.close();
    bw.close();
  }
  static class Bag{
    int weight,value;
    public Bag(int weight,int value){
      this.weight = weight;
      this.value = value;
    }
  }
}
