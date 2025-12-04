import java.util.*;
import java.io.*;
  
public class Main{

  static int N, M;
  static int[] arr;
  static boolean[] visited;
  static StringBuilder sb = new StringBuilder();
  
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringTokenizer st = new StringTokenizer(br.readLine());
    N = Integer.parseInt(st.nextToken());
    M = Integer.parseInt(st.nextToken());

    arr= new int[M];
    visited = new boolean[N+1];
    dfs(0);
    
    
    bw.write(sb.toString());
    bw.flush();
  
  }
  static void dfs(int depth){
    if(depth==M){
       for(int i = 0;i<M;i++){
         sb.append(arr[i]).append(" ");
       } 
      sb.append("\n");
      return;
    }
    
    for(int i = 1;i<=N;i++){
      if(!visited[i]){
        visited[i] = true;
        arr[depth] = i;

        dfs(depth+1);

        visited[i] = false;
      }
    }
  }
}
