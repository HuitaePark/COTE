import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    int n = Integer.parseInt(br.readLine());
    int[][] arr =new int[100][100];
    int count = 0;
    for(int k = 0;k<n;k++){
      StringTokenizer st =new StringTokenizer(br.readLine());
      int x = Integer.parseInt(st.nextToken());
      int y = Integer.parseInt(st.nextToken());
      for(int i = x;i<x+10;i++){
        for(int j = y;j<y+10;j++){
          if(++arr[i][j]==1) count++;
        }
      }
    }
    sb.append(count);  
    bw.write(sb.toString());
    bw.flush();
  }
}
