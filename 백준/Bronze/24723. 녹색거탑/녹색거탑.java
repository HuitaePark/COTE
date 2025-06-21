import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    int n = Integer.parseInt(br.readLine());
    int sum = 1;
    for(int i = 0;i<n;i++){
      sum*=2;
    }
    sb.append(sum);




     bw.write(sb.toString());
     bw.flush();
  
  }
}
