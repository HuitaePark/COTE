import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    StringTokenizer st = new StringTokenizer(br.readLine());
    int front = Integer.parseInt(st.nextToken());
    int back = Integer.parseInt(st.nextToken());
    if(front*2>=back) sb.append("E");
    else sb.append("H");
    bw.write(sb.toString());
    bw.flush();
    br.close();
    bw.close();
  }
}
