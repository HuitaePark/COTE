import java.util.*;
import java.io.*;
  
public class Main{
  
  static class Pair {
        int height;   // 키
        int count;    // 이 키가 연속으로 몇 명 있는지
        Pair(int height, int count) {
            this.height = height;
            this.count = count;
        }
    }
  
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    int n = Integer.parseInt(br.readLine());
    Stack<Pair> stack = new Stack<>();

    long count = 0L;
    for(int i = 0;i<n;i++){
      int h = Integer.parseInt(br.readLine());
      int sameCount = 1;
      
      while(!stack.isEmpty() && stack.peek().height<=h){
        Pair top = stack.pop();
        count+=top.count;
        if(top.height ==h){
          sameCount+=top.count;
        }
      }

      if(!stack.isEmpty()) count++;

      stack.push(new Pair(h,sameCount));
    }

    sb.append(count);

    bw.write(sb.toString());
    bw.flush();
  
  }
}
