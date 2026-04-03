import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());
    int[][] dp = new int[m+1][n+1];
    int[] chapter = new int[m];
    int[] page = new int[m];

    for(int i=0;i<m;i++){
      st = new StringTokenizer(br.readLine());
      chapter[i] = Integer.parseInt(st.nextToken());
      page[i] = Integer.parseInt(st.nextToken());
    }

    for(int i=1;i<=m;i++){
      for(int j=1;j<=n;j++){
        if(j<chapter[i-1]){
          dp[i][j] = dp[i-1][j];
        }
        else{
          dp[i][j] = Math.max(dp[i-1][j],dp[i-1][j-chapter[i-1]]+page[i-1]);
        }
      }
    }
    sb.append(dp[m][n]);
    bw.write(sb.toString());
    bw.flush();
    br.close();
    bw.close();
  }
}
