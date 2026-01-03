import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    LinkedList<Integer> dq = new LinkedList<>();
    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());
    for(int i=1;i<=n;i++){
        dq.addLast(i);
    }

    int count = 0;   
    st = new StringTokenizer(br.readLine());
    for(int i=0;i<m;i++){
      int current = Integer.parseInt(st.nextToken());
      int idx = dq.indexOf(current);
      int half = dq.size()/2;
      if(idx<=half){
        while(dq.peek()!=current){
          dq.addLast(dq.removeFirst());
          count++;
        }
        dq.removeFirst();
      }
      else{
        while(dq.peek()!=current){
          dq.addFirst(dq.removeLast());
          count++;
        }
        dq.removeFirst();
      }
    }
    
    sb.append(count);
    bw.write(sb.toString());
    bw.flush();
  
  }
}
