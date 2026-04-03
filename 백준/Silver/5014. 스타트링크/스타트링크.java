import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    StringTokenizer st = new StringTokenizer(br.readLine());
    int f = Integer.parseInt(st.nextToken());
    int s = Integer.parseInt(st.nextToken());
    int g = Integer.parseInt(st.nextToken());
    int u = Integer.parseInt(st.nextToken());
    int d = Integer.parseInt(st.nextToken());

    int[] board = new int[1000001];
    boolean[] visited = new boolean[1000001];
    int[] arr = {u,-d};
    Queue<Integer> q = new ArrayDeque<>();
    
    
    
    for(int i=0;i<board.length;i++){
      board[i] = -1;
    }
    board[s] = 0;
    visited[s] = true;
    q.offer(s);
    
    while(!q.isEmpty()){
      int current = q.poll();
      if(current==g) break;
      
      for(int dir=0;dir<arr.length;dir++){
        int n = current + arr[dir];
        if(n<1 || n>f) continue;
        if(visited[n]) continue;
        board[n] = board[current]+1;
        visited[n] = true;
        q.offer(n);
      }
    }
    
    if(board[g]==-1) sb.append("use the stairs");
    else sb.append(board[g]);
    
    bw.write(sb.toString());
    bw.flush();
    br.close();
    bw.close();
  }
}
