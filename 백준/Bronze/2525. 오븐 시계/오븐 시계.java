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
    int c = Integer.parseInt(br.readLine());

    h += (c/60);
    if(m+(c%60)>=60){
      h++;
      m = m+(c%60) - 60;
    }
    else{
      m = m+(c%60);
    }
    if(h>=24) h-=24;
    
    sb.append(h).append(" ").append(m);

    bw.write(sb.toString());
    bw.flush();
  
  }
}
