import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    String n = br.readLine();
    int count0 = 0;
    int count1 = 0;
    if(n.charAt(0)=='1') count1++;
    else count0++;
    for(int i=1;i<n.length();i++){
      if(n.charAt(i)=='1' && n.charAt(i-1)=='0') count1++;
      else if (n.charAt(i)=='0' && n.charAt(i-1)=='1') count0++;
    }
    int min = Math.min(count0,count1);
    sb.append(min);
    bw.write(sb.toString());
    bw.flush();
  }
}
