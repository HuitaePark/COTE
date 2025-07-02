import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();

    sb.append(pivonachi(Integer.parseInt(br.readLine())));
     bw.write(sb.toString());
     bw.flush();
  
  }
  private static int pivonachi(int n){
    if(n<=1) return n;
    else return pivonachi(n-1) + pivonachi(n-2);
  }
}
