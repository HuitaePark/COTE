import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    int n = Integer.parseInt(br.readLine());
    PriorityQueue<Integer> heap = new PriorityQueue<>((a,b)->{
      if(Math.abs(a) == Math.abs(b)){
        return Integer.compare(a, b);
      }
      else{
        return Integer.compare(Math.abs(a),Math.abs(b));
      }
    });

    for(int i = 0;i<n;i++){
      int input = Integer.parseInt(br.readLine());
      if(input==0){
        if(heap.isEmpty()){
          sb.append(0).append("\n");
        }
        else{
          sb.append(heap.poll()).append("\n");
        }
      }
      else{
        heap.offer(input);
      }
    }



    bw.write(sb.toString());
    bw.flush();
  
  }
}
