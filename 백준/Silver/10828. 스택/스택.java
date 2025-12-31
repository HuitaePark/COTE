import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    int n =Integer.parseInt(br.readLine());
    Stack<Integer> stack = new Stack<>();
    
    for(int i = 0;i<n;i++){
      String str = br.readLine();
      String[] strArr = str.split(" ");

      switch(strArr[0]){
        case "push" :
          stack.push(Integer.parseInt(strArr[1]));
          break;

        case "pop" :
          if(!stack.isEmpty()) sb.append(stack.pop()).append("\n");
          else sb.append(-1).append("\n");
          break;

        case "size" :
          sb.append(stack.size()).append("\n");
          break;

        case "empty" :
          if(stack.isEmpty()) sb.append(1).append("\n");
          else sb.append(0).append("\n");
          break;

        case "top" :
          if(stack.isEmpty()) sb.append(-1).append("\n");
          else sb.append(stack.peek()).append("\n");
          break;
      }
      
    }
    

    bw.write(sb.toString());
    bw.flush();
  
  }
}
