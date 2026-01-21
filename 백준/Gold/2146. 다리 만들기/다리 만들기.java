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
    int n = Integer.parseInt(br.readLine());
    boolean[][] land = new boolean[n][n];
    Queue<Pair> edgeQ= new ArrayDeque<>();
    int[][] board = new int[n][n];
    int[][] visited = new int[n][n];
    int[] dx = {1,-1,0,0};
    int[] dy = {0,0,1,-1};
    
    for(int i = 0;i<n;i++){
      String[] s = br.readLine().split(" ");
      for(int j =0;j<n;j++){
        if(Integer.parseInt(s[j])==1){
          land[i][j] = true;
          visited[i][j] = 0;
        }
        else{
          visited[i][j] = -1;
        }
      }
    }
    
    int number = 0;
    for(int i =0;i<n;i++){
      for(int j =0;j<n;j++){
        if(land[i][j]&& board[i][j] == 0){
          number++;
          Queue<Pair> landQ = new ArrayDeque<>();
         
          landQ.offer(new Pair(i,j));
          board[i][j] = number;
          
          while(!landQ.isEmpty()){
            Pair current = landQ.poll();
            boolean isEdge = false;
            
            for(int dir=0; dir<4; dir++){
              int nx = current.x + dx[dir];
              int ny = current.y + dy[dir];
              if(nx<0 || nx>=n || ny<0 || ny>=n) continue;
              if(!land[nx][ny]){
                isEdge = true;
                continue;
              }
              if(board[nx][ny]!=0) continue;
              board[nx][ny] = number;
              landQ.offer(new Pair(nx,ny));
            }

            if(isEdge){
              edgeQ.offer(new Pair(current.x, current.y));
            }
          }
        }
      }
    }

    int min = Integer.MAX_VALUE;
    while(!edgeQ.isEmpty()){
      Pair current = edgeQ.poll();
      for(int dir = 0; dir<4;dir++){
        int nx = current.x + dx[dir];
        int ny = current.y + dy[dir];
        if(nx<0 || nx>=n || ny<0 || ny>=n) continue;
        if(board[current.x][current.y] == board[nx][ny]) continue;
        if(board[nx][ny]==0){
          board[nx][ny] = board[current.x][current.y];
          visited[nx][ny] = visited[current.x][current.y]+1;
          edgeQ.offer(new Pair(nx, ny));
        }
        else if(board[nx][ny] != board[current.x][current.y]){
          min = Math.min(min,visited[nx][ny]+visited[current.x][current.y]);
        }
      }
    }
    
    sb.append(min);
    bw.write(sb.toString());
    bw.flush();
  }  
}
