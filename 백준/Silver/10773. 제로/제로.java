import java.util.*;
import java.io.*;

public class Main{
    public static void main(String args[]) throws IOException{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
      StringBuilder sb = new StringBuilder();
      int n = Integer.parseInt(br.readLine());
      Stack<Integer> stack = new Stack<>();
      for(int i = 0;i<n;i++){
        int k = Integer.parseInt(br.readLine());
        if(k!=0) stack.push(k);
        else if(!stack.isEmpty()) stack.pop();
      }

      int sum = 0;
      while(!stack.isEmpty()){
        sum+=stack.pop();
      }
      sb.append(sum);
      bw.write(sb.toString());
      bw.flush();

    }
}