import java.util.*;
import java.io.*;
public class Main{
  
  static class Pair{
    int x,y;
    public Pair(int x, int y){
      this.x = x;
      this.y = y;
    }
  }  
  
  public static void main(String args[]) throws IOException{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
      StringBuilder sb = new StringBuilder();
      int[] dx = {1,0,-1,0};
      int[] dy = {0,1,0,-1};
      int t = Integer.parseInt(br.readLine());
      for(int i =0;i<t;i++){
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[][] board = new int[n][m];
        boolean[][] visited = new boolean[n][m];
        int count = 0;
        Queue<Pair> q = new ArrayDeque<>();
        
        for(int j = 0;j<k;j++){
          st = new StringTokenizer(br.readLine());
          int x = Integer.parseInt(st.nextToken());
          int y = Integer.parseInt(st.nextToken());
          board[x][y] = 1;
        }

        for(int j = 0;j<n;j++){
          for(int l = 0;l<m;l++){
            if(board[j][l]==1 && !visited[j][l]){
             q.offer(new Pair(j,l));
             visited[j][l] = true;
             count++;
              while(!q.isEmpty()){
              Pair current = q.poll();
              for(int dir = 0;dir<4;dir++){
                int nx = current.x + dx[dir];
                int ny = current.y + dy[dir];
                if(nx<0 || nx>=n || ny<0 || ny>=m) continue;
                if(visited[nx][ny] || board[nx][ny]==0)continue;
                visited[nx][ny] = true;
                q.offer(new Pair(nx,ny));
              }
             }
            }
          }
        }

        sb.append(count).append("\n");
      }
      bw.write(sb.toString());
      bw.flush();
    }
}
