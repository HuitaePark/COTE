import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    int n = Integer.parseInt(br.readLine());
    Deque<Integer> q = new ArrayDeque<>();
    
    for(int i = 0;i<n;i++){
      String s = br.readLine();
      String[] arr = s.split(" ");

      switch(arr[0]){
        case "push":
          q.add(Integer.parseInt(arr[1]));
          break;

        case "pop":
          if(q.isEmpty()){
            sb.append(-1).append("\n");
          }
          else{
            sb.append(q.poll()).append("\n");
          }
          break;

        case "size":
          sb.append(q.size()).append("\n");
          break;

        case "empty":
          if(q.isEmpty()){
            sb.append(1).append("\n");
          }
          else{
            sb.append(0).append("\n");
          }
          break;

        case "front":
          if(q.isEmpty()){
            sb.append(-1).append("\n");
          }
          else{
            sb.append(q.peek()).append("\n");
          }
          break;

        case "back":
          if(q.isEmpty()){
            sb.append(-1).append("\n");
          }
          else{
            sb.append(q.peekLast()).append("\n");
          }
          break;
      }
    }
    
    bw.write(sb.toString());
    bw.flush();
  
  }
}
