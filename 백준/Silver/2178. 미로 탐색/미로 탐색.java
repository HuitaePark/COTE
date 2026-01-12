import java.util.*;
import java.io.*;

public class Main {

  static class Pair{
    int x,y;

    public Pair(int x, int y){
      this.x = x;
      this.y = y;
    }
  }
  
  public static void main(String args[]) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
      StringBuilder sb= new StringBuilder();
      StringTokenizer st = new StringTokenizer(br.readLine());
      int n = Integer.parseInt(st.nextToken());
      int m = Integer.parseInt(st.nextToken());
      int[][] board = new int[n][m];
      int[][] visited = new int[n][m];
      int[] dx = {1,0,-1,0};
      int[] dy = {0,1,0,-1};
      Queue<Pair> q = new ArrayDeque<>();
    
      for(int i = 0;i<n;i++){
        String s = br.readLine();
        for(int j = 0;j<m;j++){
          board[i][j] = Character.getNumericValue(s.charAt(j));
        }
      }

    
      visited[0][0] = 0;
      q.add(new Pair(0,0));
      while(!q.isEmpty()){
        Pair current = q.peek();
        q.poll();
        
        for(int dir = 0; dir < 4;dir++){
          int nx = current.x + dx[dir];
          int ny = current.y + dy[dir];
          if(nx<0 || nx >= n || ny < 0 || ny >= m) continue;
          if(board[nx][ny] != 1 || visited[nx][ny]>0) continue;
          visited[nx][ny] = visited[current.x][current.y]+1;
          q.offer(new Pair(nx,ny));
        }
      }

      sb.append(visited[n-1][m-1]+1);
      bw.write(sb.toString());
      bw.flush();
    }
}