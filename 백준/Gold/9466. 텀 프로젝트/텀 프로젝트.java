import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    int t = Integer.parseInt(br.readLine());
    for(int i = 0;i<t;i++){
      int n = Integer.parseInt(br.readLine());
      int[] arr = new int[n+1];
      int[] visited = new int[n+1];
      StringTokenizer st = new StringTokenizer(br.readLine());
      for(int j=1;j<=n;j++){
        arr[j] = Integer.parseInt(st.nextToken());
      }
      
      Queue<Integer> q = new ArrayDeque<>();
      int count = 0;
      
      for(int j =1;j<=n;j++){ //지목 횟수를 셈
        visited[arr[j]]++;
      }
      
      for(int j =1;j<=n;j++){ //0인 아이들의 인덱스를 큐에 추가
        if(visited[j]==0) q.offer(j);
      }

      while(!q.isEmpty()){//bfs진행
        int current = q.poll();
        visited[arr[current]]--;
        if(visited[arr[current]]==0) q.offer(arr[current]);
      }

      for(int j =1;j<=n;j++){ 
        if(visited[j]==0) count++;
      }
      
      sb.append(count).append("\n");
    }

    bw.write(sb.toString());
    bw.flush();
  }
}
