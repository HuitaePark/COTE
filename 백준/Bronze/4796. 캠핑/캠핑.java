import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();

    int count = 1;
    while(true){
      String s = br.readLine();
      if(s.equals("0 0 0")) break;
      StringTokenizer st = new StringTokenizer(s);
      int l = Integer.parseInt(st.nextToken());
      int p = Integer.parseInt(st.nextToken());
      int v = Integer.parseInt(st.nextToken());
      int answer = (v / p) * l + Math.min(v % p, l);
      sb.append("Case "+count+": "+answer+"\n");
      count++;
    }

    bw.write(sb.toString());
    bw.flush();
    br.close();
    bw.close();
  }
}
