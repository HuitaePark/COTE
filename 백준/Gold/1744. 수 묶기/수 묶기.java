import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    int n = Integer.parseInt(br.readLine());
    Queue<Integer> plus = new PriorityQueue<>(Collections.reverseOrder());
    Queue<Integer> minus = new PriorityQueue<>();
    int one = 0;
    
    for(int i=0;i<n;i++){
      int current = Integer.parseInt(br.readLine());
      if(current==1) one++;
      else if(current<1) minus.add(current);
      else plus.add(current);
    }

    int sum =0;
    
    while(plus.size()>1){
      int a = plus.poll();
      int b = plus.poll();
      sum+=(a*b);
    }

    if(!plus.isEmpty()){
      sum+=plus.poll();
    }

    while(minus.size()>1){
      int a = minus.poll();
      int b = minus.poll();
      sum+=(a*b);
    }

    if(!minus.isEmpty()){
      sum+=minus.poll();
    }

    for(int i=0;i<one;i++){
      sum++;
    }

    sb.append(sum);
    
    bw.write(sb.toString());
    bw.flush();
    br.close();
    bw.close();
  }
}
