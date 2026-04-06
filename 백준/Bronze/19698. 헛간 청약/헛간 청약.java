import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    int w = Integer.parseInt(st.nextToken());
    int h = Integer.parseInt(st.nextToken());
    int l = Integer.parseInt(st.nextToken());

    int a  = w/l;
    int b = h/l;
    sb.append(Math.min(n, a * b));
    
    bw.write(sb.toString());
    bw.flush();
    br.close();
    bw.close();
  }
}
