import java.util.*;
import java.io.*;
  
public class Main{
  static class Pair{
      int x,y;

      Pair(int x , int y){
        this.x = x;
        this.y = y;
      }
  }
    public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    StringTokenizer st = new StringTokenizer(br.readLine());
    Queue<Pair> q = new ArrayDeque<>();
    int n = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());
    int[] dx = {1,0,-1,0};
    int[] dy = {0,1,0,-1};
    int[][] board = new int[n][m];
    boolean[][] visited = new boolean[n][m];
    for(int i = 0;i<n;i++){
      st = new StringTokenizer(br.readLine());
      for(int j = 0;j<m;j++){
        board[i][j] = Integer.parseInt(st.nextToken());
      }
    }

    int count = 0;
    int max = 0;
    for(int i = 0;i<n;i++){
      for(int j = 0;j<m;j++){
        if(board[i][j] == 1 && !visited[i][j]){
          int currentMax = 0;
          q.offer(new Pair(i,j));
          visited[i][j] = true;
          count++;
    
          while(!q.isEmpty()){
            Pair current = q.peek();
            q.poll();
            currentMax++;

            for(int dir = 0; dir < 4;dir++){
              int nx = current.x + dx[dir];
              int ny = current.y + dy[dir];
              if(nx<0 || nx>=n || ny<0 || ny>=m) continue;
              if(visited[nx][ny] || board[nx][ny]!=1) continue;
              visited[nx][ny] = true;
              q.offer(new Pair(nx,ny));
            }
          }

          if(currentMax>max){
            max = currentMax;
          }
        }
      }
    }
    sb.append(count).append("\n").append(max);
      
    bw.write(sb.toString());
    bw.flush();
    
  }
}
