import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    String a = br.readLine();
    String b = br.readLine();

    sb.append(Integer.parseInt(a)*(b.charAt(2)-'0')).append("\n");
    sb.append(Integer.parseInt(a)*(b.charAt(1)-'0')).append("\n");
    sb.append(Integer.parseInt(a)*(b.charAt(0)-'0')).append("\n");
    sb.append(Integer.parseInt(a)*Integer.parseInt(b)).append("\n");

    bw.write(sb.toString());
    bw.flush();
  
  }
}
