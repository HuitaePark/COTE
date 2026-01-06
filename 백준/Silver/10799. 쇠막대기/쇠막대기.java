import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    String input = br.readLine();
    Stack<Integer> stack = new Stack<>();
    int count = 0;
    
    for(int i =0;i<input.length();i++){
      if(input.charAt(i)=='('){
        stack.push(i);
      }
      else if(input.charAt(i)==')'){
        if(!stack.isEmpty()){
          if(input.charAt(stack.peek())=='(' && stack.peek()+1==i){
            stack.pop();
            count+=stack.size();
          }
          else if(input.charAt(i-1)==')'){
            stack.pop();
            count++;
          }
        }
      }  
    }
    
    sb.append(count);
    bw.write(sb.toString());
    bw.flush();
  
  }
}
