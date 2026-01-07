import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    String input = br.readLine();
    
    Stack<Character> stack = new Stack<>();
    for(int i = 0;i<input.length();i++){
      char current = input.charAt(i);
      switch(current){
        case '+':
          while(!stack.isEmpty()
        && stack.peek() != '(') sb.append(stack.pop());
          stack.push(current);
          break;

        case '-':
          while(!stack.isEmpty()
        && stack.peek() != '(') sb.append(stack.pop());
          stack.push(current);
          break;

        case '*':
          while (!stack.isEmpty()
       && stack.peek() != '+'
       && stack.peek() != '-'
       && stack.peek() != '(') {
              sb.append(stack.pop());
          }
          stack.push(current);
          break;

        case '/':
          while (!stack.isEmpty()
       && stack.peek() != '+'
       && stack.peek() != '-'
       && stack.peek() != '(') {
              sb.append(stack.pop());
          }
          stack.push(current);
          break;

        case '(':
          stack.push(current);
          break;

        case ')':
          while(!stack.isEmpty() && stack.peek()!='(') sb.append(stack.pop());
          stack.pop();
          break;
        default:
          sb.append(current);
          break;
      }
    }
    
    while(!stack.isEmpty()){
      sb.append(stack.pop());
    }
    
    bw.write(sb.toString());
    bw.flush();
  
  }
}
