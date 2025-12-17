import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    int n = Integer.parseInt(br.readLine());

    if(n>=90) sb.append("A");
    else if(n<90 && n>=80) sb.append("B");
    else if(n<80 && n>=70) sb.append("C");
    else if(n<70 && n>=60) sb.append("D");
    else sb.append("F");





    bw.write(sb.toString());
    bw.flush();
  
  }
}
