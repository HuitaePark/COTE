import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    int n = Integer.parseInt(br.readLine());
    int[] arr = new int[n+1];
    int[] answer = new int[n+1];
    StringTokenizer st = new StringTokenizer(br.readLine());
    Stack<Integer> stack = new Stack<>();
    
    for(int i= 1;i<=n;i++){
      arr[i] = Integer.parseInt(st.nextToken());
    }

    for(int i = n;i > 0; i--){
      if(stack.isEmpty() || arr[stack.peek()]>arr[i]) {
        stack.push(i);
        continue;
      }
      while(!stack.isEmpty() && arr[stack.peek()]<arr[i]){
        answer[stack.pop()] = i;
      }
      stack.push(i);
    }

    for(int i = 1; i <= n; i++){
    sb.append(answer[i]).append(" ");
    }
    bw.write(sb.toString().trim());
    bw.flush();
  
  }
}

