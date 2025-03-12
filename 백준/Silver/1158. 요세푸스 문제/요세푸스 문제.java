import java.util.*;
import java.io.*;

public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
     StringTokenizer st = new StringTokenizer(br.readLine());
     Queue<Integer> q = new LinkedList<>();
  	 int N = Integer.parseInt(st.nextToken());
	 int K = Integer.parseInt(st.nextToken());
    for(int i = 1; i <= N; i++) {
			q.add(i);
		} 
    bw.write("<");
     while(q.size()>1){
       for(int i=0;i<K-1;i++){
         q.offer(q.poll());
       }
      bw.write(Integer.toString(q.poll())+", ");
     }
    bw.write(Integer.toString(q.poll())+">");
    bw.flush();
  }
}
