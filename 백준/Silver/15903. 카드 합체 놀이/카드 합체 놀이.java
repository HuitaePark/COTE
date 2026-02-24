import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());
    Queue<Long> q = new PriorityQueue<>();
    st = new StringTokenizer(br.readLine());
    for(int i=0;i<n;i++){
      q.add(Long.parseLong(st.nextToken()));
    }
    for(int i=0;i<m;i++){
      long a = q.poll();
      long b = q.poll();
      q.add(a+b);
      q.add(a+b);
    }
    long sum=0;
    while(!q.isEmpty()){
      sum+=q.poll();
    }
    sb.append(sum);
    bw.write(sb.toString());
    bw.flush();
  }
}
