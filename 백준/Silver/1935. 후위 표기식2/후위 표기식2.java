import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    int n = Integer.parseInt(br.readLine());
    String input = br.readLine();
    double[] arr = new double[n];
    
    for(int i = 0;i<n;i++){
      double d = Double.parseDouble(br.readLine());
      arr[i] = d;
    }
    
    Stack<Double> stack = new Stack<>();
    for(int i = 0;i<input.length();i++){
      char current = input.charAt(i);
      
      switch(current){
        case '+':
          double a = stack.pop();
          double b = stack.pop();
          stack.push(b+a);
          break;

        case '-':
          double c = stack.pop();
          double d = stack.pop();
          stack.push(d-c);
          break;

        case '*':
          double e = stack.pop();
          double f = stack.pop();
          stack.push(f*e);
          break;

        case '/':
          double g = stack.pop();
          double h = stack.pop();
          stack.push(h/g);
          break;

        default:
          stack.push(arr[current-'A']);
          break;
      }
    }
    sb.append(String.format("%.2f", stack.pop()));
    bw.write(sb.toString());
    bw.flush();
  
  }
}
