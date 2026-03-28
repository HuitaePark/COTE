import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    Queue<Integer> q = new PriorityQueue<>((a,b)->{
      if(Math.abs(a)!=Math.abs(b)) return Math.abs(a)-Math.abs(b);
      return a-b;
    });
    int n = Integer.parseInt(br.readLine());
    for(int i=0;i<n;i++){
      int current = Integer.parseInt(br.readLine());
      if(current!=0) q.offer(current);
      else if(!q.isEmpty() && current ==0) sb.append(q.poll()).append("\n");
      else sb.append(0).append("\n");
    }
    bw.write(sb.toString());
    bw.flush();
  }
}
