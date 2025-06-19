import java.util.*;
import java.io.*;

public class Main {
  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    int n = Integer.parseInt(br.readLine());
    Deque<int[]> deq = new ArrayDeque<>(); // [번호, 이동값]
    
    StringTokenizer st= new StringTokenizer(br.readLine());
    for (int i=0; i<n; i++){
      int m = Integer.parseInt(st.nextToken());
      deq.addLast(new int[]{i+1, m});  // 번호 + 이동값 저장
    }
    
    int[] curr = deq.poll();
    int po = curr[1];
    sb.append(curr[0]).append(" ");

    while (!deq.isEmpty()) {
      if (po > 0) {
        for (int i = 1; i < po; i++) {
          deq.addLast(deq.pollFirst());
        }
        curr = deq.pollFirst();
      } else {
        for (int i = 1; i < Math.abs(po); i++) {
          deq.addFirst(deq.pollLast());
        }
        curr = deq.pollLast();
      }
      po = curr[1];
      sb.append(curr[0]).append(" ");
    }

    bw.write(sb.toString().trim());
    bw.flush();
  }
}
