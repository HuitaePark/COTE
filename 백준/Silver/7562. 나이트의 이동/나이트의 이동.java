import java.util.*;
import java.io.*;
  
public class Main{
  static class Pair{
    int x, y;
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
    int[] dx = {-2,-2,-1,-1,1,1,2,2};
    int[] dy = {1,-1,2,-2,2,-2,1,-1};
    
    for(int i = 0;i<n;i++){
      int l = Integer.parseInt(br.readLine());
      StringTokenizer st= new StringTokenizer(br.readLine());
      int startX = Integer.parseInt(st.nextToken());
      int startY = Integer.parseInt(st.nextToken());
      q.add(new Pair(startX,startY));
      st= new StringTokenizer(br.readLine());
      int endX = Integer.parseInt(st.nextToken());
      int endY = Integer.parseInt(st.nextToken());
      int[][] board = new int[l][l];
      int[][] visited = new int[l][l];
      visited[startX][startY] = 1;
      
      while(!q.isEmpty()){
        Pair current  = q.poll();
        for(int dir = 0; dir<8; dir++){
          int nx = current.x + dx[dir];
          int ny = current.y + dy[dir];
          if(nx<0 || nx>=l || ny<0 || ny>=l) continue;
          if(visited[nx][ny]>0) continue;
          visited[nx][ny] = visited[current.x][current.y]+1;
          q.add(new Pair(nx,ny));
        }
      }
      sb.append(visited[endX][endY]-1).append("\n");
    }
    
    bw.write(sb.toString());
    bw.flush();
  }
}
