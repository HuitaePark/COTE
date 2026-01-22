import java.util.*;
import java.io.*;
  
public class Main{
  static class Node{
    int x,y,jump;
    public Node(int x, int y, int jump){
      this.x = x;
      this.y = y;
      this.jump = jump;
    }
  }

  static int[] dx = {1, -1, 0, 0, -2, -2, -1, -1, 1, 1, 2, 2};
  static int[] dy = {0, 0, 1, -1, 1, -1, 2, -2, 2, -2, 1, -1};
  
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    int n = Integer.parseInt(br.readLine());
    StringTokenizer st = new StringTokenizer(br.readLine());
    int w = Integer.parseInt(st.nextToken());
    int h = Integer.parseInt(st.nextToken());
    int[][] miro = new int[h][w];
    int[][][] visited = new int[h][w][n+1];
    Queue<Node> q = new ArrayDeque<>();
    
    for(int i = 0;i<h;i++){
      st = new StringTokenizer(br.readLine());
      for(int j =0;j<w;j++){
        int current = Integer.parseInt(st.nextToken());
        miro[i][j] = current;
        if(current==1){
          for(int k = 0;k<n;k++){
            visited[i][j][k] = -1;
          }
        }
      }
    }
    
    q.offer(new Node(0,0,0));
    visited[0][0][0] = 1;
        
    while(!q.isEmpty()){
      Node current = q.poll();

      // 목표 지점 도달 시 바로 종료
      if (current.x == h - 1 && current.y == w - 1) {
          sb.append(visited[current.x][current.y][current.jump] - 1);
          bw.write(sb.toString());
          bw.flush();
          return;
        }
      
      for(int dir = 0;dir<12;dir++){
        int nx = current.x + dx[dir];
        int ny = current.y + dy[dir];
        if(nx<0 || nx>=h || ny<0 || ny>=w) continue;//범위체크
        if(miro[nx][ny]==1) continue; //벽체크
        
        if(dir<4){//점프 안할때
          if (visited[nx][ny][current.jump] == 0) {
          visited[nx][ny][current.jump] = visited[current.x][current.y][current.jump]+1;
          q.offer(new Node(nx,ny,current.jump));
          }
        }
        else{//점프할때
          if(current.jump<n){//점프 횟수가 남아있을때
            if (visited[nx][ny][current.jump + 1] == 0) {
            visited[nx][ny][current.jump+1] = visited[current.x][current.y][current.jump]+1;
            q.offer(new Node(nx,ny,current.jump+1));
            }
          }
        }
      }
    }
    
    sb.append(-1);
    bw.write(sb.toString());
    bw.flush();
  }
}
