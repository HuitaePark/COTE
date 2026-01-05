import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    int n = Integer.parseInt(br.readLine());
    int count = 0;
    
      for (int i = 0; i < n; i++) {
            Stack<Character> stack = new Stack<>();
            String input = br.readLine();
  
            for (int j = 0; j < input.length(); j++) {
              char c = input.charAt(j);
              if (!stack.isEmpty() && stack.peek() == c) {
                      stack.pop();
                  } 
              else {
                      stack.push(c);
                  }
              }
  
              
              if (stack.isEmpty()) {
                  count++;
              }
          }
    
    sb.append(count);
    bw.write(sb.toString());
    bw.flush();
  
  }
  
}
