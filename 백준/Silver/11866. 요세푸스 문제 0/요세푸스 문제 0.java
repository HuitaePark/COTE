import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    int k = Integer.parseInt(st.nextToken());
    Queue<Integer> q = new LinkedList<>();
    for(int i = 0;i<n;i++){
      q.add(i+1);
    }
    List<Integer> list = new ArrayList<>();
    int flag = 0;
    int p = 0;
    sb.append("<");

    while (!q.isEmpty()) {
      for (int i = 0; i < k - 1; i++) {
        q.add(q.poll());  // K-1명은 앞에서 꺼내 뒤로 보냄
      }
      sb.append(q.poll()); // K번째 사람 제거
      if (!q.isEmpty()) {
        sb.append(", ");
      }
    }
    


      
     sb.append(">");
     bw.write(sb.toString());
     bw.flush();
  
  }
}
