import java.util.*;
import java.io.*;

public class Main {
  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringBuilder sb = new StringBuilder();

    while(true){
      Stack<Character> stack = new Stack<>();
      String input = br.readLine();
      boolean isYes = true;
      if(input.equals(".")) break;
      
      for(int i = 0;i<input.length();i++){
        if(input.charAt(i)=='['||input.charAt(i)=='{'||input.charAt(i)=='(') stack.push(input.charAt(i));
        
        if(input.charAt(i)==']' && !stack.isEmpty() && stack.peek() == '[') stack.pop();
        else if(input.charAt(i)==']' && !stack.isEmpty() && stack.peek() != '['){ 
          isYes = false;
          break;
        }
        else if(stack.isEmpty() && input.charAt(i)==']'){
          isYes = false;
          break;
        } 

        if(input.charAt(i)=='}' && !stack.isEmpty() && stack.peek() == '{') stack.pop();
        else if(input.charAt(i)=='}' && !stack.isEmpty() && stack.peek() != '{'){
          isYes = false;
          break;
        }
        else if(stack.isEmpty() && input.charAt(i)=='}'){
          isYes = false;
          break;
        }

        if(input.charAt(i)==')' && !stack.isEmpty() && stack.peek() == '(') stack.pop();
        else if(input.charAt(i)==')' && !stack.isEmpty() && stack.peek() != '('){
          isYes = false;
          break;
        }
        else if(stack.isEmpty() && input.charAt(i)==')'){
          isYes = false;
          break;
        }
      }
      
      if(isYes && stack.isEmpty()) sb.append("yes").append("\n");
      else sb.append("no").append("\n");
    }
    
    bw.write(sb.toString());
    bw.flush();
  }
}
