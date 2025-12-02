import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    
    int n = Integer.parseInt(br.readLine());
    Stack<Integer> stack = new Stack<>();
    int[] arr = new int[n + 1];
    
    for (int i = 1; i <= n; i++) {
      arr[i] = Integer.parseInt(br.readLine());
    }

    int num = 1;

    for (int i = 1; i <= n; i++) {
      int current = arr[i];

      if (current >= num) {
    
        while (current >= num) {
          stack.push(num++);
          sb.append("+\n");
        }

        stack.pop();
        sb.append("-\n");
      } 
      else {
        int m = stack.pop();

        if (m != current) {
          bw.write("NO\n");
          bw.flush();
          return;
          
        } else {
          sb.append("-\n");
        }
      }
    }

    bw.write(sb.toString());
    bw.flush();
  }
}
