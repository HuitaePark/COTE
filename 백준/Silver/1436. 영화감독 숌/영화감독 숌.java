import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    int n = Integer.parseInt(br.readLine());
    int count = 0;
    int i = 1;
    while(count!=n){
      i++;
      if(Integer.toString(i).contains("666")){
        count++;
      }
    }
    sb.append(i);
    bw.write(sb.toString());
    bw.flush();
  }
}
