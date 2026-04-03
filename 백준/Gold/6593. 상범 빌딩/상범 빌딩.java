import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();

    while(true){
      String line = br.readLine();
      if (line == null || line.equals("0 0 0")) break;
      if (line.isEmpty()) continue;

      StringTokenizer st = new StringTokenizer(line);
      int l = Integer.parseInt(st.nextToken());
      int r = Integer.parseInt(st.nextToken());
      int c = Integer.parseInt(st.nextToken());
    
      char[][][] board = new char[l][r][c];
      int[][][] visited = new int[l][r][c];
      Queue<Coordinate> q = new ArrayDeque<>();
      for(int i=0;i<l;i++){
        for(int j=0;j<r;j++){
          String s = br.readLine();
          while (s != null && s.isEmpty()) s = br.readLine();
          for(int k=0;k<c;k++){
            board[i][j][k] = s.charAt(k);
            if(s.charAt(k)=='S'){
             q.offer(new Coordinate(i,j,k));
             visited[i][j][k] = 1;
            }
          }
        }
      }

      int[] dr = {0,0,1,-1,0,0};
      int[] dc = {0,0,0,0,1,-1};
      int[] dz = {1,-1,0,0,0,0};
      int answer = 0;
      a:while(!q.isEmpty()){
        Coordinate current = q.poll();
        for(int dir = 0;dir<6;dir++){
          int nz = current.z + dz[dir];
          int nr = current.r + dr[dir];
          int nc = current.c + dc[dir];
          if(nz<0 || nz>=l || nr<0 || nr>=r || nc<0 || nc>=c) continue;
          if(visited[nz][nr][nc]>0 || board[nz][nr][nc]=='#') continue;
          visited[nz][nr][nc] = visited[current.z][current.r][current.c] +1;
          if(board[nz][nr][nc]=='E'){
            answer = visited[current.z][current.r][current.c];
            break a;
          }
          q.offer(new Coordinate(nz, nr, nc));
        }
      }
      if(answer==0) sb.append("Trapped!").append("\n");
      else sb.append("Escaped in ").append(answer).append(" minute(s).").append("\n");
    }

    bw.write(sb.toString());
    bw.flush();
    br.close();
    bw.close();
  }
  static class Coordinate{
    int z,r,c;
    public Coordinate(int z,int r,int c){
      this.r = r;
      this.c = c;
      this.z = z;
    }
  }
}
