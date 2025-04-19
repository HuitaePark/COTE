import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    StringTokenizer st = new StringTokenizer(br.readLine());
    int x = Integer.parseInt(st.nextToken());
    int y = Integer.parseInt(st.nextToken());
    int c = Integer.parseInt(br.readLine());
    int n = Integer.parseInt(br.readLine());

    int i = (x*n+y<=c*n && x<=c) ? 1 : 0;
    
    
    sb.append(i);
    


     bw.write(sb.toString());
     bw.flush();
  
  }
}
