import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    int n = Integer.parseInt(br.readLine());
    List<Meeting> list = new ArrayList<>();

    for(int i=0;i<n;i++){
      StringTokenizer st = new StringTokenizer(br.readLine());
      list.add(new Meeting(Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken())));
    }

    Collections.sort(list,(a,b)->{
      if(a.end == b.end) {
        return a.start - b.start;
      }
        return a.end - b.end;
    });

    int start = 0;
    int end =0;
    int count = 0;
    for(int i=0;i<n;i++){
      int currentStart = list.get(i).start;
      int currentEnd = list.get(i).end;
      if(currentStart>=end){
        start = currentStart;
        end = currentEnd;
        count++;
      }
    }
    sb.append(count);

    bw.write(sb.toString());
    bw.flush();
    br.close();
    bw.close();
  }
  static class Meeting{
    int start,end;
    public Meeting(int start,int end){
      this.start = start;
      this.end = end;
    }
  }
}
