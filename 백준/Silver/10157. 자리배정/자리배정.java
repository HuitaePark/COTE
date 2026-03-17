import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringTokenizer st = new StringTokenizer(br.readLine());
    
    int c = Integer.parseInt(st.nextToken());
    int r = Integer.parseInt(st.nextToken());
    int k = Integer.parseInt(br.readLine());
    
    // 1. 배정할 수 없는 K값이면 0 출력 후 바로 종료
    if (k > c * r) {
      bw.write("0\n");
      bw.flush();
      return;
    }

    int[][] arr = new int[r][c];
    
    // 2. 루프 진입 시 ++를 먼저 하므로 -1부터 시작
    int currentR = -1;
    int currentC = 0;
    int count = 1;

    while(count <= r * c) {
      // 위로 이동
      // 3. 현재 위치가 아닌 '다음 칸(+1)'이 배열 안인지, 빈칸(0)인지 미리 체크!
      while(currentR + 1 < r && arr[currentR + 1][currentC] == 0) {
        currentR++;
        arr[currentR][currentC] = count;
        // K번째 사람을 찾으면 1-based 좌표(+1)로 출력하고 종료
        if (count == k) {
          bw.write((currentC + 1) + " " + (currentR + 1) + "\n");
          bw.flush();
          return;
        }
        count++;
      }
      
      // 오른쪽으로 이동
      while(currentC + 1 < c && arr[currentR][currentC + 1] == 0) {
        currentC++;
        arr[currentR][currentC] = count;
        if (count == k) {
          bw.write((currentC + 1) + " " + (currentR + 1) + "\n");
          bw.flush();
          return;
        }
        count++;
      }
      
      // 아래로 이동
      while(currentR - 1 >= 0 && arr[currentR - 1][currentC] == 0) {
        currentR--;
        arr[currentR][currentC] = count;
        if (count == k) {
          bw.write((currentC + 1) + " " + (currentR + 1) + "\n");
          bw.flush();
          return;
        }
        count++;
      }
      
      // 왼쪽으로 이동
      while(currentC - 1 >= 0 && arr[currentR][currentC - 1] == 0) {
        currentC--;
        arr[currentR][currentC] = count;
        if (count == k) {
          bw.write((currentC + 1) + " " + (currentR + 1) + "\n");
          bw.flush();
          return;
        }
        count++;
      }
    }
  }
}