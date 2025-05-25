import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    int n = Integer.parseInt(br.readLine());
    
   a:for(int i = 0;i<n;i++){
      String str = br.readLine();
      Deque<Character> stack = new ArrayDeque<>();
      
      for(int j = 0;j<str.length();j++){
        if(str.charAt(j)=='(') {
          stack.push(str.charAt(j));
        }
        else if(stack.isEmpty()&&str.charAt(j)==')'){
          sb.append("NO").append("\n");
          continue a;
        }
        else{
          stack.pop();
        }
        
      }
      if(stack.isEmpty()) sb.append("YES").append("\n");
        else sb.append("NO").append("\n");
    }
    



     bw.write(sb.toString());
     bw.flush();
    }
  }

