import java.util.*;
import java.io.*;
  
public class Main{
  
  static int r,c;
  static int[][] board;
  static boolean[][] visited; 
  static Queue<Pair> q = new ArrayDeque<>();
  static int[] dr = {1,-1,0,0};
  static int[] dc = {0,0,1,-1};
  
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    StringTokenizer st = new StringTokenizer(br.readLine());
    r = Integer.parseInt(st.nextToken());
    c = Integer.parseInt(st.nextToken());
    int k = Integer.parseInt(st.nextToken());
    board = new int[r][c];
    visited = new boolean[r][c];
    
    for(int i=0;i<k;i++){
      st = new StringTokenizer(br.readLine());
      int startR = Integer.parseInt(st.nextToken());
      int startC = Integer.parseInt(st.nextToken());
      int endR = Integer.parseInt(st.nextToken());
      int endC = Integer.parseInt(st.nextToken());
      for(int j=startR;j<endR;j++){
        for(int l=startC;l<endC;l++){
          board[l][j] = -1;
          visited[l][j] = true;
        }
      }
    }

    List<Integer> list = new ArrayList<>();
    for(int i=0;i<r;i++){
      for(int j=0;j<c;j++){
        if(board[i][j]==0){
          int count = bfs(i,j);
          list.add(count);
        }
      }
    }
    Collections.sort(list);
    sb.append(list.size()).append("\n");
    for(int i : list){
      sb.append(i).append(" ");
    }
    
    bw.write(sb.toString());
    bw.flush();
    br.close();
    bw.close();
  }
  static int bfs(int i,int j){
    visited[i][j] = true;
    board[i][j] = 1;
    q.offer(new Pair(i,j));
    int count = 1;
    
    while(!q.isEmpty()){
      Pair current = q.poll();
      for(int dir =0;dir<4;dir++){
        int nr = current.r + dr[dir];
        int nc = current.c + dc[dir];
        if(nr<0 || nr>=r || nc<0 || nc>=c) continue;
        if(visited[nr][nc] || board[nr][nc]!=0) continue;
        board[nr][nc] = 1;
        visited[nr][nc] = true;
        q.offer(new Pair(nr,nc));
        count++;
      }
    }

    return count;
  }
  static class Pair{
    int r,c;
    public Pair(int r,int c){
      this.r = r;
      this.c = c;
    }
  }
}
