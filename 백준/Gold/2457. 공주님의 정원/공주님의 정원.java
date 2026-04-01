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
      int a = Integer.parseInt(st.nextToken());
      int b = Integer.parseInt(st.nextToken());
      int c = Integer.parseInt(st.nextToken());
      int d = Integer.parseInt(st.nextToken());
      list.add(new Pair(a*100+b,c*100+d));
    }
    Collections.sort(list,(a,b)->{
      if(a.start!=b.start) return a.start-b.start;
      return a.end-b.end;
    });
    
    int current = 301;
    int maxEnd = 0;
    int idx = 0;
    int count = 0;
    while(current<=1130){
        boolean isUpdate = false;
        while(idx<n && list.get(idx).start <= current){
          if(list.get(idx).end>maxEnd){
            maxEnd = list.get(idx).end;
            isUpdate = true;
          }
          idx++;
        }
        if(!isUpdate){
          System.out.println(0);
          return;
        }
        current = maxEnd;
        count++;
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
      this.end = end;
    }
  }
}
