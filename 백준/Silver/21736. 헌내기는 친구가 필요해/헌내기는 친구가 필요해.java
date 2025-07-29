import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());
    boolean[][] visited = new boolean[n][m];
    
    int x = 0;
    int y = 0;
    int count = 0;
    
    String[] arr = new String[n];
    for(int i = 0;i<n;i++){
      arr[i] = br.readLine();
      for(int j =0;j<m;j++){
        if(arr[i].charAt(j)=='I'){
          x = i;
          y = j;
        }
      }
    }

    int[] dx = {-1,1,0,0};
    int[] dy = {0,0,1,-1};
    visited[x][y] = true;
    
    Queue<int[]> q = new LinkedList<>(); 
    q.add(new int[]{x,y});

    while(!q.isEmpty()){
      int[] now = q.poll();
      int currentX = now[0];
      int currentY = now[1];

      for(int i = 0;i<4;i++){
        int nx = currentX+dx[i];
        int ny = currentY+dy[i];

        if (nx < 0 || nx >= n || ny < 0 || ny >= m) {
            continue; // 배열 범위를 벗어나면 무시
        }
        
        if (!visited[nx][ny] && arr[nx].charAt(ny) != 'X') {
            visited[nx][ny] = true; // 방문 처리
            
            if (arr[nx].charAt(ny) == 'P') {
                count++; // 사람('P')을 만나면 count 증가
            }
            
            q.add(new int[]{nx, ny}); // 다음 탐색을 위해 큐에 추가
        }
        
        
      }
    }
    


    if (count == 0){
          sb.append("TT");
      } 
    else{
          sb.append(count);
      }

    bw.write(sb.toString());
    bw.flush();
  
  }
}
