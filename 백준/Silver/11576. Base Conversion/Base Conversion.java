import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    StringTokenizer st = new StringTokenizer(br.readLine());
    int future = Integer.parseInt(st.nextToken());
    int past = Integer.parseInt(st.nextToken());
    
    int n = Integer.parseInt(br.readLine());
    
    st = new StringTokenizer(br.readLine());
    int[] arr = new int[n];
    for(int i=0;i<n;i++){
      arr[i] = Integer.parseInt(st.nextToken());
    }

    int decimal = 0;
    for(int i = 0; i < n; i++) {
    decimal = decimal * future + arr[i];
    }
    
    if (decimal == 0) {
      System.out.println(0);
      return;
    }

    Stack<Integer> stack = new Stack<>();
    while (decimal > 0) {
        stack.push(decimal % past); 
        decimal/= past;            
    }

    while(!stack.isEmpty()){
      sb.append(stack.pop()).append(" ");
    }
    bw.write(sb.toString());
    bw.flush();
    br.close();
    bw.close();
  }
}
