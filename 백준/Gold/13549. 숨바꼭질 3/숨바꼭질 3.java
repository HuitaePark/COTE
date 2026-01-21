import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    int[] board =  new int[200001];
    Arrays.fill(board,-1);
    boolean[] visited =  new boolean[200001];
    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());
    if(n==m){
      bw.write("0");
      bw.flush();
      return;
    }

    Deque<Integer> q = new ArrayDeque<>();
    q.offer(n);
    board[n] = 0;
    while(!q.isEmpty()){
      int current = q.poll();
      
      if(visited[current]) continue;
      visited[current] = true;
      
      if (current == m) {
          sb.append(board[current]);
          break;
      }
      
      int[] range = {current+1, current-1, current*2};
      
      for(int i : range){
         if(i<0 || i>=200000) continue;
         int nextTime = (i == current*2) ? board[current] : board[current]+1;
         if(board[i] == -1 || board[i]>nextTime){
           board[i] = nextTime;
           if(i==current*2){
            q.offerFirst(i);
           }
           else{
             q.offerLast(i);
           }
         }
       }
    }
    bw.write(sb.toString());
    bw.flush();
  }
}
