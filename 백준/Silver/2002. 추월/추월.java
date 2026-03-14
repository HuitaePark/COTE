import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    Queue<String> q = new ArrayDeque<>();
    Set<String> set = new HashSet<>();
    int n = Integer.parseInt(br.readLine());
    for(int i=0;i<n;i++){
      q.offer(br.readLine());
    }
    int count = 0;
    for(int i=0;i<n;i++){
      String current = br.readLine();
      if(!q.isEmpty() && !q.peek().equals(current)){
        set.add(current);
        count++;
      }
      else q.poll();
      while(!q.isEmpty() && set.contains(q.peek())){
        q.poll();
      }
    }
    sb.append(count);
    bw.write(sb.toString());
    bw.flush();
  }
}
