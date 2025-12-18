import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    int n = Integer.parseInt(br.readLine());
    int current = n;
    for(int i = 0;i<n;i++){
      sb.append(" ".repeat(i)).append("*".repeat(2*current-1)).append("\n");
      current--;
    }



    bw.write(sb.toString());
    bw.flush();
  
  }
}
