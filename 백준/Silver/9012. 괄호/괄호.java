import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    int n = Integer.parseInt(br.readLine());
    
    for(int i = 0;i<n;i++){
      String input = br.readLine();
      Stack<Character> stack  =new Stack<>();
      boolean isYes = true;
      
      for(int j = 0;j<input.length();j++){
        if(input.charAt(j) == '(') stack.push(input.charAt(j));
        else if(stack.isEmpty()&&input.charAt(j) == ')'){
          isYes = false;
          break;
        }
        else if(!stack.isEmpty()&&input.charAt(j) == ')') stack.pop();
        else if(stack.peek()==')'&&input.charAt(j) == ')') {
          isYes = false;
          break;
        }
      } 


      if(isYes&&stack.isEmpty()) sb.append("YES").append("\n");
      else sb.append("NO").append("\n");
    }

    bw.write(sb.toString());
    bw.flush();
    }
  }

