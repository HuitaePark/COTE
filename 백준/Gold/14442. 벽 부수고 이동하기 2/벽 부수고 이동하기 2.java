import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());
    int k = Integer.parseInt(st.nextToken());
    char[][]board = new char[n][m];
    int[][][] visited = new int[n][m][k+1];
    for(int i=0;i<n;i++){
      String s = br.readLine();
      for(int j=0;j<m;j++){
        board[i][j] = s.charAt(j);
      }
    }
  
    Queue<Pair> q = new ArrayDeque<>();
    q.offer(new Pair(0,0,0));
    visited[0][0][0] = 1;  
    int count = 0;
    int[] dr = {1,-1,0,0};
    int[] dc = {0,0,1,-1};
    while(!q.isEmpty()){
      Pair current = q.poll();
      if (current.r == n-1 && current.c == m-1) {
        count = visited[current.r][current.c][current.broken];
        break;
      }
      for(int dir = 0;dir<4;dir++){
        int nr = current.r + dr[dir];
        int nc = current.c + dc[dir];
        if(nr<0 || nr>=n || nc<0 || nc>=m) continue;
        if (board[nr][nc] == '0' && visited[nr][nc][current.broken] == 0) {
          visited[nr][nc][current.broken] = visited[current.r][current.c][current.broken] + 1;
          q.offer(new Pair(nr, nc, current.broken));
        }

        else if (board[nr][nc] == '1' && current.broken < k && visited[nr][nc][current.broken + 1] == 0) {
          visited[nr][nc][current.broken + 1] = visited[current.r][current.c][current.broken] + 1;
          q.offer(new Pair(nr, nc, current.broken + 1));
        }
      }
    }
    if(count==0) sb.append(-1);
    else sb.append(count);
    bw.write(sb.toString());
    bw.flush();
    br.close();
    bw.close();
  }
  static class Pair{
    int r,c,broken;
    public Pair(int r, int c, int broken){
      this.r = r;
      this.c = c;
      this.broken = broken;
    }
  }
}
