import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    int n = Integer.parseInt(br.readLine());
    Queue<Integer> q = new LinkedList<>();
    for(int i = 1;i<=n;i++){
      q.add(i);
    }

    while(q.size() > 1){
      q.poll();
      if(q.size()>1){
        q.add(q.poll());
      }
    }
    
    sb.append(q.poll());
    bw.write(sb.toString());
    bw.flush();
  
  }
}
