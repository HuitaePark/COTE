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
    int k = Integer.parseInt(st.nextToken());
    int[][] arr = new int[n][m];

    for(int i=0;i<n;i++){
      st = new StringTokenizer(br.readLine());
      for(int j=0;j<m;j++){
        arr[i][j] = Integer.parseInt(st.nextToken());
      }
    }
    int rotate = Math.min(n,m)/2;
    int startR = 0;
    int startC = 0;
    int endR = n-1;
    int endC = m-1;
    
    for(int l=0;l<rotate;l++){
      Deque<Integer> dq = new ArrayDeque<>();
      // 왼쪽에서 오른쪽으로
      for (int j = startC; j < endC; j++) {
          dq.offerLast(arr[startR][j]);
      }
      // 위에서 아래로
      for (int i = startR; i < endR; i++) {
          dq.offerLast(arr[i][endC]);
      }
      // 오른쪽에서 왼쪽으로
      for (int j = endC; j > startC; j--) {
          dq.offerLast(arr[endR][j]);
      }
      // 아래에서 위로
      for (int i = endR; i > startR; i--) {
          dq.offerLast(arr[i][startC]);
      }

      int rotations = k % dq.size();
      for (int r = 0; r < rotations; r++) {
          dq.offerLast(dq.pollFirst()); 
      }

      //위쪽 덮어쓰기
      for (int j = startC; j < endC; j++) arr[startR][j] = dq.pollFirst();
      //오른쪽 덮어쓰기
      for (int i = startR; i < endR; i++) arr[i][endC] = dq.pollFirst();
      //아래쪽 덮어쓰기
      for (int j = endC; j > startC; j--) arr[endR][j] = dq.pollFirst();
      //왼쪽 덮어쓰기
      for (int i = endR; i > startR; i--) arr[i][startC] = dq.pollFirst();
      
      startR++;
      startC++;
      endR--;
      endC--;
    }

    for(int i=0;i<n;i++){
      for(int j=0;j<m;j++){
        sb.append(arr[i][j]).append(" ");
      }
      sb.append("\n");
    }
    
    bw.write(sb.toString());
    bw.flush();
    br.close();
    bw.close();
  }
}
