import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    boolean[][] arr = new boolean[101][101];
    int n = Integer.parseInt(br.readLine());
    for(int i=0;i<n;i++){
      StringTokenizer st = new StringTokenizer(br.readLine());
      int r = Integer.parseInt(st.nextToken());
      int c = Integer.parseInt(st.nextToken());
      for(int j=r;j<r+10;j++){
        for(int k=c;k<c+10;k++){
          if(!arr[j][k]) arr[j][k] = true;
        }
      }
    }

    int count = 0;
    int[] dx = {1,0,-1,0};
    int[] dy = {0,1,0,-1};
    for(int i=0;i<100;i++){
      for(int j=0;j<100;j++){
        if(arr[i][j]){
          for(int dir =0;dir<4;dir++){
           int nx = i+dx[dir];
           int ny = j+dy[dir];
            if(nx<0 || nx>=100 || ny<0 || ny>=100){
              count++;
              continue;
            }
            if(!arr[nx][ny]){
              count++;
            }
          }
        }
      }
    }
    sb.append(count);
    bw.write(sb.toString());
    bw.flush();
  }
}
