import java.util.*;
import java.io.*;
  
public class Main{
  
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    int n = Integer.parseInt(br.readLine());
    int[][] board = new int[n][n];
    int[] dr = {1,-1,0,0};
    int[] dc = {0,0,1,-1};
    int max = Integer.MIN_VALUE;
    
    for(int i=0;i<n;i++){
      StringTokenizer st = new StringTokenizer(br.readLine());
      for(int j=0;j<n;j++){
        board[i][j] = Integer.parseInt(st.nextToken());
        if(board[i][j]>max) max = board[i][j];
      }
    }

    int maxCount = 1;
    for(int m=0;m<=max;m++){
      Queue<Pair> q = new ArrayDeque<>();
      boolean[][] visited = new boolean[n][n];
      int count = 0;
      for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
          if(board[i][j] > m && !visited[i][j]){
            q.offer(new Pair(i,j));
            visited[i][j] = true;
            while(!q.isEmpty()){
              Pair current = q.poll();
              for(int dir=0;dir<4;dir++){
                int nr = current.r + dr[dir];
                int nc = current.c + dc[dir];
                if(nr<0 || nr>=n || nc<0 || nc>=n) continue;
                if(!visited[nr][nc] && board[nr][nc] > m){
                  q.offer(new Pair(nr,nc));
                  visited[nr][nc] = true;
                }
              }
            }
            count++;
          }
        }
      }
      maxCount = Math.max(count,maxCount);
    }
    
    sb.append(maxCount);
    bw.write(sb.toString());
    bw.flush();
    br.close();
    bw.close();
  }
  static class Pair{
    int r,c;
    public Pair(int r, int c){
      this.r = r;
      this.c = c;
    }
  }
}
