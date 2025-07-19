import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    int n = Integer.parseInt(br.readLine());
    Queue<Integer> heap = new PriorityQueue<>(Collections.reverseOrder());
    
    for(int i = 0;i<n;i++){
      int x = Integer.parseInt(br.readLine());
      if(x==0){
          if(heap.isEmpty()){
          sb.append(0).append("\n");
        }
        else{
          sb.append(heap.poll()).append("\n");
        }
      }
      else{
        heap.add(x);
      }
      
    }

    bw.write(sb.toString());
    bw.flush();
  
  }
}
