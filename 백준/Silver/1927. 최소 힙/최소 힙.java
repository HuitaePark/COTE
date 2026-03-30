import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    int n = Integer.parseInt(br.readLine());
    Queue<Integer> q = new PriorityQueue<>();
    for(int i=0;i<n;i++){
      int current = Integer.parseInt(br.readLine());
      if(current==0){
        if(!q.isEmpty()) sb.append(q.poll()).append("\n");
        else sb.append(0).append("\n");
      }
      else {
        q.offer(current);
      }
    }
    bw.write(sb.toString());
    bw.flush();
  }
}
