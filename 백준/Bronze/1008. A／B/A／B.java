import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();

    StringTokenizer st = new StringTokenizer(br.readLine());

    double a = Double.parseDouble(st.nextToken());
    double b = Double.parseDouble(st.nextToken());

    sb.append(a/b);

    bw.write(sb.toString());
    bw.flush();
  
  }
}
