import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    int n = Integer.parseInt(br.readLine()); 
    if(n==1) sb.append(1);
    else {
      n-=1;
      int count = 1;
      while(true){
        if(n<=(count*6)) {
          sb.append(count+1);
          break;
        }
        n -= count * 6;
        count++;
      }
    }

    bw.write(sb.toString());
    bw.flush();
  }
}