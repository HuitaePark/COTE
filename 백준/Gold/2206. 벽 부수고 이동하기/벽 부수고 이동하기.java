import java.util.*;
import java.io.*;
  
public class Main{
  static class Node{
    int x,y,broken;
    public Node(int x, int y, int broken){
      this.x = x;
      this.y = y;
      this.broken = broken;
    }
  }
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());
    int[] dx = {1,-1,0,0};
    int[] dy = {0,0,1,-1};
    char[][] board = new char[n][m];
    int[][][] visited = new int[n][m][2];
    Queue<Node> q = new ArrayDeque<>();
    
    for(int i =0;i<n;i++){
    String s = br.readLine();
      for(int j=0;j<m;j++){
        board[i][j] = s.charAt(j);
      }
    }
    q.offer(new Node(0,0,0));
    visited[0][0][0] = 1;
    
    while(!q.isEmpty()){
      Node current = q.poll();
      for(int dir =0;dir<4;dir++){
        int nx = current.x+dx[dir];
        int ny = current.y+dy[dir];
        
        if(current.x==n-1 && current.y==m-1){
          sb.append(visited[current.x][current.y][current.broken]);
          bw.write(sb.toString());
          bw.flush();
          return;
        }
        
        //범위 초과
        if(nx<0 || nx>=n || ny<0 || ny>=m) continue;
        
        if(board[nx][ny]=='1'){//벽을 만났을경우
         if(current.broken==0 && visited[nx][ny][1]==0){
           visited[nx][ny][1] = visited[current.x][current.y][0]+1;
           q.offer(new Node(nx,ny,1));
         } 
        }
        else{//기둥을 만났을때
          if(visited[nx][ny][current.broken]==0){
           visited[nx][ny][current.broken] = visited[current.x][current.y][current.broken]+1;
           q.offer(new Node(nx,ny,current.broken));
         }
        }
      }
    }
    sb.append(-1);
    bw.write(sb.toString());
    bw.flush();
  }
}
