import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    StringTokenizer st = new StringTokenizer(br.readLine());
    int h = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());


    if(45<=m){
      m -=45;
      sb.append(h).append(" ").append(m);
    }
    else{
      m = (60 - (45 - m));
      if(h==0){
        h = 23;
      }
      else{
        h--;
      }
      sb.append(h).append(" ").append(m);
    }
    bw.write(sb.toString());
    bw.flush();
  
  }
}
