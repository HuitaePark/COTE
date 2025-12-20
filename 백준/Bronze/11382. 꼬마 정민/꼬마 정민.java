import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    StringTokenizer st = new StringTokenizer(br.readLine());

    long a = Long.parseLong(st.nextToken());
    long b = Long.parseLong(st.nextToken());
    long c = Long.parseLong(st.nextToken());

    sb.append(a+b+c);

    bw.write(sb.toString());
    bw.flush();
  
  }
}
