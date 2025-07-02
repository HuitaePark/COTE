import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    
    sb.append(factorial(Integer.parseInt(br.readLine()))); 
    bw.write(sb.toString());
    bw.flush();
  
  }
  private static long factorial(int m){
    if( m==1 || m == 0) return 1;
    else return m * factorial(m-1);
  }
}
