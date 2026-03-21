import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    Stack<Character> stack = new Stack<>();
    String s = br.readLine();

    int sum = 0;
    int combo = 1;
    for(int i=0;i<s.length();i++){
      char current = s.charAt(i);
        if(!stack.isEmpty() && stack.peek()=='[' && current==')'){
          System.out.println(0);
          return;
        }
        else if(!stack.isEmpty() && stack.peek()=='(' && current==']'){
          System.out.println(0);
          return;
        }
        else if(stack.isEmpty() && current==')'){
          System.out.println(0);
          return;
        }
        else if(stack.isEmpty() && current==']'){
          System.out.println(0);
          return;
        }
        else if(current=='('){
          combo*=2;
          stack.push(current);
        }
        else if(current=='['){
          combo*=3;
          stack.push(current);
        }
        else if(current==')'){
          if(s.charAt(i-1)=='(') sum+=combo;
          combo/=2;
          stack.pop();
        }
        else if(current==']'){
          if(s.charAt(i-1)=='[') sum+=combo;
          combo/=3;
          stack.pop();
        }
    }
    if(!stack.isEmpty()){
      System.out.println(0);
      return;
    }
    sb.append(sum);
    bw.write(sb.toString());
    bw.flush();
  }
}
