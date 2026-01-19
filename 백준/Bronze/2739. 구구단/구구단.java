import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    int n  =Integer.parseInt(br.readLine());

    for(int i = 1;i<=9;i++){
      sb.append(n).append(" * ").append(i).append(" = ").append(i*n).append("\n");
    }

    bw.write(sb.toString());
    bw.flush();
  }
}
