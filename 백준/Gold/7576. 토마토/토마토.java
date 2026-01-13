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
    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());
    int[][] board = new int[m][n];
    int[][] visited = new int[m][n];
    int[] dx = {1,0,-1,0};
    int[] dy = {0,1,0,-1};
    Queue<Pair> q = new ArrayDeque<>();

    for(int i = 0;i<m;i++){
      st = new StringTokenizer(br.readLine());
      for(int j =0;j<n;j++){
        int cur = Integer.parseInt(st.nextToken());
        board[i][j] = cur;
        if(cur==1) {
          q.offer(new Pair(i,j));
          visited[i][j] = 1;
          }
      }
    }
    
    while(!q.isEmpty()){
      Pair current = q.peek();
      q.poll();

      for(int dir = 0; dir<4;dir++){
        int nx = current.x + dx[dir];
        int ny = current.y + dy[dir];
        if(nx<0 || nx>=m || ny<0 || ny>=n) continue;
        if(visited[nx][ny]>0 || board[nx][ny]==-1) continue;
        visited[nx][ny] = visited[current.x][current.y]+1;
        q.offer(new Pair(nx,ny));
      }
    }

    int maxDays = 0;
    boolean isError = false;
    for(int i = 0;i<m;i++){
      for(int j = 0;j<n;j++){
        if(visited[i][j]>maxDays) maxDays = visited[i][j];
        if(board[i][j]!=-1 && visited[i][j] == 0){
          isError = true;
          break;
        }
      }
    }

    if(isError) sb.append(-1);
    else sb.append(maxDays-1);
    
    bw.write(sb.toString());
    bw.flush();
  
  }
}
