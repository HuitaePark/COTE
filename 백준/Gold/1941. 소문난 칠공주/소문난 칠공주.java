import java.util.*;
import java.io.*;
  
public class Main{
  static int count = 0;
  static char[][] ch = new char[5][5];
  static int[] selected = new int[7];
  static int[] dx = {1,-1,0,0};
  static int[] dy = {0,0,1,-1};
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();    
    for(int i = 0;i<5;i++){
      String s =  br.readLine();
      for(int j=0;j<5;j++){
        ch[i][j] = s.charAt(j);
      }
    }
    func(0,0,0);
    sb.append(count);
    bw.write(sb.toString());
    bw.flush();
  }
  static void func(int index, int cnt, int sCount){
    if(cnt==7){
      if(sCount >= 4) {
            if(isConnected()) count++; 
        }
        return;
    }
    if (index==25) return;
    selected[cnt] = index;
    func(index+1,cnt+1,sCount+(ch[index/5][index%5]=='S'? 1 : 0));
    func(index+1,cnt,sCount);
    }
  static boolean isConnected() {  
    Queue<Pair> q = new ArrayDeque<>();
    boolean[][] isSelected = new boolean[5][5];
    boolean[][] visited = new boolean[5][5];

    for(int idx : selected){
      isSelected[idx/5][idx%5] = true;
    }

    int first = selected[0];
    q.add(new Pair(first/5, first% 5));
    visited[first/5][first%5] = true;
    int connCnt = 1;

    while(!q.isEmpty()){
      Pair current = q.poll();
      for(int dir = 0; dir < 4; dir++){
        int nx = current.x + dx[dir];
        int ny = current.y + dy[dir];
        
        if(nx >= 0 && nx < 5 && ny >= 0 && ny < 5){
          if(isSelected[nx][ny] && !visited[nx][ny]){
            visited[nx][ny] = true;
            q.add(new Pair(nx, ny));
            connCnt++;
          }
        }
      }
    }
    return connCnt == 7;
  }
  static class Pair{
    int x,y;
    public Pair(int x, int y){
      this.x = x;
      this.y = y;
    }
  }
}
