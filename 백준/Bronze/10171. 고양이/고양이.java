import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();

    sb.append("\\    /\\").append("\n");
    sb.append(" )  ( \')").append("\n");
    sb.append("(  /  )").append("\n");
    sb.append(" \\(__)|").append("\n");





    bw.write(sb.toString());
    bw.flush();
  
  }
}
