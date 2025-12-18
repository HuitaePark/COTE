import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    int n = Integer.parseInt(br.readLine());
    for(int i = 1;i<=n;i++){
      sb.append(" ".repeat(n-i)).append("*".repeat(2*i-1)).append("\n");
    }


    bw.write(sb.toString());
    bw.flush();
  
  }
}
