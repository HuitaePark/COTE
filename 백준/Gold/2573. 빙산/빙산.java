import java.util.*;
import java.io.*;
  
public class Main{
  static class Pair{
    int x,y;
    public Pair(int x,int y){
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
    
    int[][] board = new int[n][m];
    
    int[] dx = {1,-1,0,0};
    int[] dy = {0,0,1,-1};
    
    for(int i = 0;i<n;i++){
      String[] str = br.readLine().split(" ");
      for(int j =0;j<m;j++){
        board[i][j] = Integer.parseInt(str[j]);
      }
    }
    
    Queue<Pair> q = new ArrayDeque<>();
    int year = 0;
    
    while(true){
      boolean[][] visited = new boolean[n][m];
      int[][] meltAmount = new int[n][m];
      int count = 0;
      
      //개수 세기 bfs
      for(int i =0;i<n;i++){
        for(int j =0;j<m;j++){
          if(board[i][j]>0 && !visited[i][j]){
            q.offer(new Pair(i,j));
            visited[i][j] = true;
            while(!q.isEmpty()){
              Pair current = q.poll();
              for(int dir = 0;dir<4;dir++){
                  int nx = current.x + dx[dir];
                  int ny = current.y + dy[dir];
                  if(nx<0 || nx>=n || ny<0 || ny>=m) continue;
                  if(board[nx][ny]==0 || visited[nx][ny]) continue;
                  visited[nx][ny] = true;
                  q.offer(new Pair(nx,ny));
                }
            }
            count++;
          }
        }
      }

      if(count>=2){
        sb.append(year);
        break;
      }

      if(count==0){
        sb.append(0);
        break;
      }
      
      
      //빙하 근처 바다세기
      for(int i =0;i<n;i++){
        for(int j =0;j<m;j++){
          if(board[i][j]>0){
           int seaCount = 0;
            for(int dir = 0;dir<4;dir++){
            int nx = i + dx[dir];
            int ny = j + dy[dir];
            if(nx<0 || nx>=n || ny<0 || ny>=m) continue;
            if(board[nx][ny]==0) seaCount++;
          }
          meltAmount[i][j] = seaCount; 
          }
        }
      }

      //빙하깎기
      for(int i =0;i<n;i++){
        for(int j =0;j<m;j++){
          if(board[i][j]>0) board[i][j] -= meltAmount[i][j];
          if(board[i][j]<0) board[i][j] = 0;
        }
      }
      year++;
    }

    bw.write(sb.toString());
    bw.flush();
  }
}
