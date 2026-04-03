import java.util.*;
import java.io.*;
import java.util.stream.Collectors;

public class Main{
  
  static int n;
  static char[][] board;
  static boolean[][] visited;
  static Queue<Pair> queue = new ArrayDeque<>();
  static int[] dr = {1,-1,0,0};
  static int[] dc = {0,0,1,-1};
  
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    n = Integer.parseInt(br.readLine());
    board = new char[n][n];
    visited = new boolean[n][n];

    for(int i=0;i<n;i++){
      String s = br.readLine();
      for(int j=0;j<n;j++){
        board[i][j] = s.charAt(j);
      }
    }

    Queue<Integer> q = new PriorityQueue<>();
    for(int i=0;i<n;i++){
      for(int j=0;j<n;j++){
        if(board[i][j]=='1' && !visited[i][j]){
          int count = bfs(i,j);
          q.offer(count);
        }
      }
    }

    sb.append(q.size()).append("\n");
    while(!q.isEmpty()){
      sb.append(q.poll()).append("\n");
    }
    
    bw.write(sb.toString());
    bw.flush();
  }
  static int bfs(int i,int j){
    int count = 1;
    visited[i][j] = true;
    queue.offer(new Pair(i,j));
    
    while(!queue.isEmpty()){
      Pair current = queue.poll();
      for(int dir = 0;dir<4;dir++){
        int nr = current.r + dr[dir];
        int nc = current.c + dc[dir];
        if(nr<0 || nr>=n || nc<0 || nc>=n) continue;
        if(visited[nr][nc] || board[nr][nc]=='0') continue;
        visited[nr][nc] = true;
        queue.offer(new Pair(nr,nc));
        count++;
      }
    }
    return count;
  }
  static class Pair{
    int r,c;
    public Pair(int r, int c){
      this.r = r;
      this.c = c;
    }
  }
}
