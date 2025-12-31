import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    int n  =Integer.parseInt(br.readLine());
    Stack<Integer> stack = new Stack<>();
    int count = 1;
    for(int i = 0;i<n;i++){ 
      int current = Integer.parseInt(br.readLine());
      while(count <= current){
        stack.push(count++);
        sb.append("+").append("\n"); 
      }
      
      if(stack.peek()!=current){
        sb.setLength(0);
        sb.append("NO");
        break;
      }
      
      while(!stack.isEmpty()&&stack.peek()==current){
        stack.pop();
        sb.append("-").append("\n");
      }
    }
    
    bw.write(sb.toString());
    bw.flush();
  }
}
