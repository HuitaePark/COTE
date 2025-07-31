import java.util.*;
import java.io.*;
  
public class Main{
  static final int INF = 10000;
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());

    int[][] dist = new int[n+1][n+1];

    for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == j) {
                    dist[i][j] = 0; // 자기 자신으로 가는 거리는 0
                } else {
                    dist[i][j] = INF; // 나머지는 무한대로 초기화
                }
            }
        }

     for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            // 가중치가 없는 그래프이므로 거리를 1로 설정
            dist[u][v] = 1;
            dist[v][u] = 1;
        }

    for(int k =1;k<=n;k++){
      for(int i =1;i<=n;i++){
        for(int j =1;j<=n;j++){
          if (dist[i][j] > dist[i][k] + dist[k][j]){
                        dist[i][j] = dist[i][k] + dist[k][j];
          }
        }
      }
    }


    int minKevinBacon = Integer.MAX_VALUE;
    int resultPerson = -1;
    
    
    for(int i = 1;i<=n;i++){
      int currentKevinBacon = 0;
      for(int j =1;j<=n;j++){
        currentKevinBacon +=dist[i][j];
    }

      if(minKevinBacon>currentKevinBacon){
       minKevinBacon  = currentKevinBacon;
       resultPerson = i;
      }
    }
    


    sb.append(resultPerson);


    bw.write(sb.toString());
    bw.flush();
  
  }
}
