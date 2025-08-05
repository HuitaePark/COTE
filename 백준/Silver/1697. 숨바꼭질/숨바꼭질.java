import java.util.*;
import java.io.*;

public class Main {
  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();

    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    int k = Integer.parseInt(st.nextToken());
    
    // 예외 케이스: 시작 == 목표
    if (n == k) {
      bw.write("0\n");
      bw.flush();
      return;
    }

    Queue<Integer> q = new LinkedList<>();
    Set<Integer> visited = new HashSet<>();

    q.add(n);
    visited.add(n);
    int second = 0;
    
    while (!q.isEmpty()) {
      int size = q.size();
      second++;
      
      for (int i = 0; i < size; i++) {
        int current = q.poll();

        // 목표 도달
        if (current == k) {
          sb.append(second - 1);
          bw.write(sb.toString());
          bw.flush();
          return;
        }

        // 다음 이동들
        int[] next = {current + 1, current - 1, current * 2};
        for (int nextPos : next) {
          if (nextPos >= 0 && nextPos <= 100000 && !visited.contains(nextPos)) {
            q.add(nextPos);
            visited.add(nextPos);
          }
        }
      }
    }
  }
}
