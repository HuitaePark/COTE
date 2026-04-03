import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    int n = Integer.parseInt(br.readLine());
    int hp = 100;
    int[] lose = new int[n];
    int[] happy = new int[n];
    int[][] dp  =new int[n+1][100];

    StringTokenizer st = new StringTokenizer(br.readLine());
    for(int i=0;i<lose.length;i++){
      lose[i] = Integer.parseInt(st.nextToken());
    }
    st = new StringTokenizer(br.readLine());
    for(int i=0;i<lose.length;i++){
      happy[i] = Integer.parseInt(st.nextToken());
    }
    
    for(int i=1;i<=n;i++){
      int minus = lose[i-1];
      int plus = happy[i-1];
      for(int j=1;j<100;j++){
        if(j<minus) dp[i][j] = dp[i-1][j];
        else{
          dp[i][j] = Math.max(dp[i-1][j],plus+dp[i-1][j-minus]);
        }
      }
    }
    sb.append(dp[n][99]);
    bw.write(sb.toString());
    bw.flush();
    br.close();
    bw.close();
  }
}
