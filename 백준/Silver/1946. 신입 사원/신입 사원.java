import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    int t = Integer.parseInt(br.readLine());
    for(int i=0;i<t;i++){
      List<Pair> list = new ArrayList<>();
      int n = Integer.parseInt(br.readLine());
      for(int j=0;j<n;j++){
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        list.add(new Pair(a,b));
      }
      Collections.sort(list,(a,b)->{
        if(a.score1 != b.score1) return a.score1-b.score1;
        return a.score2-b.score2;
      });
      
      int count = 1;
      int min = list.get(0).score2;

      for(int j=1;j<list.size();j++){
        if(list.get(j).score2<min){
          count++;
          min = list.get(j).score2;
        }
      }
      sb.append(count).append("\n");
    }

    bw.write(sb.toString());
    bw.flush();
    br.close();
    bw.close();
  }
  static class Pair{
    int score1,score2;
    public Pair(int score1, int score2){
      this.score1 = score1;
      this.score2 = score2;
    }
  }
}
