import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    int n  = Integer.parseInt(br.readLine());
    Deque<Integer> dq = new ArrayDeque<>();
    for(int i =0;i<n;i++){
      String s = br.readLine();
      String[] sArr = s.split(" ");
      switch(sArr[0]){
        case "push_front":
          dq.addFirst(Integer.parseInt(sArr[1]));
          break;

        case "push_back":
          dq.addLast(Integer.parseInt(sArr[1]));
          break;

        case "pop_back":
          if(dq.isEmpty()){
            sb.append(-1).append("\n");
          }
          else{
            sb.append(dq.removeLast()).append("\n");
          }
          break;
          
        case "pop_front":
          if(dq.isEmpty()){
            sb.append(-1).append("\n");
          }
          else{
            sb.append(dq.removeFirst()).append("\n");
          }
          break;

        case "size":
          sb.append(dq.size()).append("\n");
          break;

        case "empty":
          if(dq.isEmpty()){
            sb.append(1).append("\n");
          }
          else{
            sb.append(0).append("\n");
          }
          break;

        case "front":
          if(dq.isEmpty()){
            sb.append(-1).append("\n");
          }
          else{
            sb.append(dq.peek()).append("\n");
          }
          break;

        case "back":
          if(dq.isEmpty()){
            sb.append(-1).append("\n");
          }
          else{
            sb.append(dq.peekLast()).append("\n");
          }
          break;
      }
    }
    
    bw.write(sb.toString());
    bw.flush();
  
  }
}
