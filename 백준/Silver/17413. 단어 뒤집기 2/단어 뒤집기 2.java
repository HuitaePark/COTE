import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    Stack<Character> stack = new Stack<>();
    boolean isStart = false;
    String s = br.readLine();
    for(int i=0;i<s.length();i++){
      char current = s.charAt(i);
      if(current=='<'){
        isStart = true;
        if(!stack.isEmpty()){
          while(!stack.isEmpty()) sb.append(stack.pop());
        }
      }

      if(current==' '){
        if(!stack.isEmpty()) while(!stack.isEmpty()) sb.append(stack.pop());
        sb.append(current);
        continue;
      }
      
      if(isStart){
        sb.append(current);
      }
      else{
        stack.push(current);
      }
      if(current=='>') isStart = false;
    }

    if(!stack.isEmpty()) while(!stack.isEmpty()) sb.append(stack.pop());
    
    bw.write(sb.toString());
    bw.flush();
  }
}
