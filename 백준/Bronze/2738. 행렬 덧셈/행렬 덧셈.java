import java.util.*;
import java.io.*;

public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());
    int[][] a = new int[n][m];
    int[][] b = new int[n][m];
    
    for(int i = 0;i<n;i++){
      st = new StringTokenizer(br.readLine());
      for(int j =0;j<m;j++){
        a[i][j] = Integer.parseInt(st.nextToken());
      }
    }
    for(int i = 0;i<n;i++){
      st = new StringTokenizer(br.readLine());
      for(int j =0;j<m;j++){
        b[i][j] = Integer.parseInt(st.nextToken());
      }
    }
    for(int i = 0;i<n;i++){
      for(int j =0;j<m;j++){
        bw.write(Integer.toString(a[i][j]+b[i][j])+" ");
      }
      bw.write("\n");
    }
    bw.flush();
  }
}
