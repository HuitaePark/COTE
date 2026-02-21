import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    int n = Integer.parseInt(br.readLine());
    Queue<Integer> q = new ArrayDeque<>();
    for(int i=0;i<n;i++){
      q.offer(i+1);
    }
    int count = 1;
    while(q.size()!=1){
      if(count%2==1){
        sb.append(q.poll()).append(" ");
      }
      else{
        q.offer(q.poll());
      }
      count++;
    }
    sb.append(q.poll());
    bw.write(sb.toString());
    bw.flush();
  }
}
