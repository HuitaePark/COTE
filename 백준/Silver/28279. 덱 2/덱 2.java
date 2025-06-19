import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    int n = Integer.parseInt(br.readLine());
    Deque<Integer> deq = new ArrayDeque<>();
    for(int i = 0;i<n;i++){
      String str = br.readLine();
      String[] arr= str.split(" ");
      switch(Integer.parseInt(arr[0])){
        case 1:
          deq.addFirst(Integer.parseInt(arr[1]));
          break;
        case 2:
          deq.addLast(Integer.parseInt(arr[1]));
          break;
        case 3:
          if(!deq.isEmpty()){
            sb.append(deq.pollFirst()).append("\n");
          }
          else{
            sb.append(-1).append("\n");
          }
          break;
        case 4:
          if(!deq.isEmpty()){
            sb.append(deq.pollLast()).append("\n");
          }
          else{
            sb.append(-1).append("\n");
          }
          break;
        case 5:
          sb.append(deq.size()).append("\n");
          break;
        case 6:
          if(!deq.isEmpty()){
            sb.append(0).append("\n");
          }
          else{
            sb.append(1).append("\n");
          }
          break;
        case 7:
          if(!deq.isEmpty()){
            sb.append(deq.peekFirst()).append("\n");
          }
          else{
            sb.append(-1).append("\n");
          }
          break;
        case 8:
          if(!deq.isEmpty()){
            sb.append(deq.peekLast()).append("\n");
          }
          else{
            sb.append(-1).append("\n");
          }
          break;
          
      } 
    }




     bw.write(sb.toString());
     bw.flush();
  
  }
}
