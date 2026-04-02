import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    int n = Integer.parseInt(br.readLine());
    List<Pair> list = new ArrayList<>();
    for(int i=0;i<n;i++){
      StringTokenizer st = new StringTokenizer(br.readLine());
      list.add(new Pair(Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()))); 
    }

    Collections.sort(list,(a,b)->{
      if(a.start!=b.start) return a.start-b.start;
      return a.end-b.end;
    });
    Queue<Pair> q = new PriorityQueue<>((a,b)->{
      if(a.end!=b.end) return a.end-b.end;
      return a.start-b.start;
    });
    
    int count = 0;
    for(int i=0;i<n;i++){
      if(q.isEmpty()){
        q.offer(list.get(i));
        count++;
      }
      else{
        if(list.get(i).start<q.peek().end){
          q.offer(list.get(i));
          count++;
        }
        else{
          q.poll();
          q.offer(list.get(i));
        }
      }
    }
    
    sb.append(count);
    bw.write(sb.toString());
    bw.flush();
    br.close();
    bw.close();
  }
  static class Pair{
    int start,end;
    public Pair(int start,int end){
      this.start = start;
      this.end  = end;
    }
  }
}
