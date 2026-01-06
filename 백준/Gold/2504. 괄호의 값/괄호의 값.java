import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    String input = br.readLine();
    Stack<Character> stack = new Stack<>();
    int tmp = 1;
    int result = 0;
    
    a:for(int i = 0;i<input.length();i++){
      char current = input.charAt(i);
      
      switch(current){
        case '[':
          stack.push(current);
          tmp*=3;
          break;
        
        case '(':
          stack.push(current);
          tmp*=2;
          break;
        
        case ')':
          if(stack.isEmpty() || stack.peek()!='('){
            result = 0;
            break a;
          }

          if(input.charAt(i-1)=='('){
            result+=tmp;
          }

          stack.pop();
          tmp/=2;
          break;
          
        case ']':
          if(stack.isEmpty() || stack.peek()!='['){
            result = 0;
            break a;
          }

          if(input.charAt(i-1)=='['){
            result+=tmp;
          }

          stack.pop();
          tmp/=3;
          break;
      }
    }

    if(!stack.isEmpty()) sb.append(0);
    else sb.append(result);
    
    bw.write(sb.toString());
    bw.flush();
  
  }
}
