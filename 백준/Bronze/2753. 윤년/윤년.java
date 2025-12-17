import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();

    int year = Integer.parseInt(br.readLine());

    if(year%4==0 && (year%100!=0 || year%400==0)) sb.append(1);
    else sb.append(0);


    bw.write(sb.toString());
    bw.flush();
  
  }
}
