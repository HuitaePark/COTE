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
    Queue<Pair> q = new ArrayDeque<>();
    int n = Integer.parseInt(br.readLine());
    char[][] board = new char[n][n];
    boolean[][] nomalVis = new boolean[n][n];
    boolean[][] blindVis = new boolean[n][n];
    int[] dx = {1,0,-1,0};
    int[] dy = {0,1,0,-1};
    int nomal = 0;
    int blind = 0;
    for(int i =0;i<n;i++){
      String s = br.readLine();
      for(int j = 0;j<n;j++){
        board[i][j] = s.charAt(j);
      }
    }
    //정상 시야 BFS
    for(int i =0;i<n;i++){
      for(int j = 0;j<n;j++){
        if(!nomalVis[i][j]){
          q.offer(new Pair(i,j));
          nomalVis[i][j] = true;
          nomal++;
          while(!q.isEmpty()){
            Pair current = q.poll();
            for(int dir = 0;dir<4;dir++){
              int nx = current.x + dx[dir];
              int ny = current.y + dy[dir];
              if(nx<0 || nx>=n || ny<0 || ny>=n) continue;
              if(nomalVis[nx][ny] || board[nx][ny]!=board[current.x][current.y]) continue;
              nomalVis[nx][ny] = true;
              q.offer(new Pair(nx,ny));
            }
          }
        }
      }
    }
    //적록색약 BFS
    for(int i =0;i<n;i++){
      for(int j = 0;j<n;j++){
        if(!blindVis[i][j]){
          q.offer(new Pair(i,j));
          blindVis[i][j] = true;
          blind++;
          while(!q.isEmpty()){
            Pair current = q.poll();
            for(int dir = 0;dir<4;dir++){
              int nx = current.x + dx[dir];
              int ny = current.y + dy[dir];
              if(nx<0 || nx>=n || ny<0 || ny>=n) continue;
              if(blindVis[nx][ny]) continue;
              else if(board[current.x][current.y] == 'B' && board[nx][ny]!='B') continue;
              else if(board[current.x][current.y] != 'B' && board[nx][ny]=='B') continue;
              blindVis[nx][ny] = true;
              q.offer(new Pair(nx,ny));
            }
          }
        }
      }
    }
    sb.append(nomal).append(" ").append(blind);
    bw.write(sb.toString());
    bw.flush();
  }
}
