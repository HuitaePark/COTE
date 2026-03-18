import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    int n = Integer.parseInt(br.readLine());
    for(int i=0;i<n;i++){
      int m = Integer.parseInt(br.readLine());
      List<Integer> list = new ArrayList<>();
      StringTokenizer st = new StringTokenizer(br.readLine());
      for(int j=0;j<m;j++){
        list.add(Integer.parseInt(st.nextToken()));
      }
      Collections.sort(list);
      sb.append(list.get(0)).append(" ").append(list.get(list.size()-1)).append("\n");
    }

    bw.write(sb.toString());
    bw.flush();
  }
}
