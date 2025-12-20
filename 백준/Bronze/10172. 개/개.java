import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    sb.append("|\\_/|").append("\n");
    sb.append("|q p|   /}").append("\n");
    sb.append("( 0 )\"\"\"\\").append("\n");
    sb.append("|\"^\"`    |").append("\n");
    sb.append("||_/=\\\\__|").append("\n");
    
    bw.write(sb.toString());
    bw.flush();
  
  }
}
