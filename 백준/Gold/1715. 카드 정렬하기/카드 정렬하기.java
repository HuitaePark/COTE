import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    int n = Integer.parseInt(br.readLine());
    Queue<Integer> q = new PriorityQueue<>();

    for(int i=0;i<n;i++){
      q.add(Integer.parseInt(br.readLine()));
    }

    int sum = 0;
    while(q.size()!=1){
      int current = q.size()/2;
      for(int i=0;i<current;i++){
        int a = q.poll();
        int b = q.poll();
        q.offer(a+b);
        sum+=(a+b);
      }
    }

    sb.append(sum);
    bw.write(sb.toString());
    bw.flush();
    br.close();
    bw.close();
  }
}
