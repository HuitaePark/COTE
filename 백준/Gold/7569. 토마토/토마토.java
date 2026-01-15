import java.util.*;
import java.io.*;
  
public class Main{
  static class Node {
    int z, y, x;  
    Node(int z, int y, int x) {
        this.z = z;
        this.y = y;
        this.x = x;
    }
}
  
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    StringTokenizer st = new StringTokenizer(br.readLine());
    int x = Integer.parseInt(st.nextToken());
    int y = Integer.parseInt(st.nextToken());
    int z = Integer.parseInt(st.nextToken());
    int[][][] board = new int[z][y][x];
    int[][][] visited = new int[z][y][x];
    int[] dz = {0, 0, 0, 0, 1, -1};
    int[] dy = {1, -1, 0, 0, 0, 0};
    int[] dx = {0, 0, 1, -1, 0, 0};
    Queue<Node> q = new ArrayDeque<>();
    int day = Integer.MIN_VALUE;
    for(int i = 0; i<z;i++){
      for(int j =0;j<y;j++){
        st = new StringTokenizer(br.readLine());
        for(int k = 0;k<x;k++){
          board[i][j][k] = Integer.parseInt(st.nextToken());
          if(board[i][j][k]==-1) visited[i][j][k] = -1;
          else if(board[i][j][k]==1){
            visited[i][j][k] = 1;
            q.add(new Node(i,j,k));
          }
        }
      }
    }

    while(!q.isEmpty()){
      Node current = q.poll();
      for(int dir =0; dir<6;dir++){
        int nz = current.z + dz[dir];
        int ny = current.y + dy[dir];
        int nx = current.x + dx[dir];
        if(nz<0 || nz >= z || ny<0 || ny>=y || nx<0 || nx>=x) continue;
        if(visited[nz][ny][nx]>0 || board[nz][ny][nx]==-1) continue;
        visited[nz][ny][nx] = visited[current.z][current.y][current.x]+1;
        q.offer(new Node(nz,ny,nx));
      }
    }
    boolean isError = false;
    for(int i = 0; i<z;i++){
      for(int j =0;j<y;j++){
        for(int k = 0;k<x;k++){
          if(visited[i][j][k]>0 && day<visited[i][j][k]) day = visited[i][j][k];
          if(visited[i][j][k] == 0){
            isError = true;
            break;
          } 
        }
      }
    }
    
    if(isError) sb.append(-1);
    else sb.append(day-1);
    
    bw.write(sb.toString());
    bw.flush();
  }
}

