import java.util.*;
import java.io.*;
  
public class Main {
    public static void main(String args[]) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
      StringBuilder sb = new StringBuilder();
      int n = Integer.parseInt(br.readLine());   
      int[] arr = new int[n];
      Stack<Integer> stack = new Stack<>();
      long sum = 0;
      
      for(int i = 0;i<n;i++){
        arr[i] = Integer.parseInt(br.readLine());
      }

      for(int i =0;i<n;i++){
        while(!stack.isEmpty() && arr[stack.peek()] <= arr[i]){
          stack.pop();
        }
        sum+=stack.size();
        stack.push(i);
      }

      
      
      sb.append(sum);
      bw.write(sb.toString());
      bw.flush();
  
  }
}
