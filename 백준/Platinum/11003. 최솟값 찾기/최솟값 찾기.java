import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    int l = Integer.parseInt(st.nextToken());
    Deque<Node> deq = new ArrayDeque<>();
    
    st = new StringTokenizer(br.readLine());
    for(int i = 1;i<=n;i++){
      int now = Integer.parseInt(st.nextToken());

      while(!deq.isEmpty() && deq.getLast().value > now){
        deq.removeLast();
      }
      deq.addLast(new Node(now,i));

      if(deq.getFirst().index<=i-l){
        deq.removeFirst();
      }

      sb.append(deq.getFirst().value).append(" ");
    }

    bw.write(sb.toString());
    bw.flush();
  
  }
  
  static class Node {
    public int value;
    public int index;
    
    Node(int value, int index) {
    this.value = value;
    this.index = index;

    }
  }
}
