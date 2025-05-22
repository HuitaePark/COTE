import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    ArrayDeque<Integer> stack = new ArrayDeque<>();
    int n =Integer.parseInt(br.readLine());
    
    for(int i = 0;i<n;i++){
      
      String[] arr = br.readLine().split(" ");
      
      switch(arr[0]){
        case "1" :
          stack.push(Integer.parseInt(arr[1]));
          break;
        case "2" :
          if(!stack.isEmpty()){
            sb.append(stack.pop()).append("\n");
          }
          else{
            sb.append(-1).append("\n");
          }
          break;
        case "3" :
          sb.append(stack.size()).append("\n");
          break;
        case "4" :
          if(!stack.isEmpty()){
            sb.append(0).append("\n");
          }
          else{
            sb.append(1).append("\n");
          }
          break;
        case "5" :
          if(!stack.isEmpty()){
            sb.append(stack.peek()).append("\n");
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
