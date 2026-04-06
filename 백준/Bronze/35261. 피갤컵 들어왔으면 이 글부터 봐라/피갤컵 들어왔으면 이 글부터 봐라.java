import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    String eagle = "eagle";
    int n = Integer.parseInt(br.readLine());
    String s = br.readLine();
    
    int min = 5;
    for(int i=0;i<n-4;i++){
      int current = 5;
      for(int j=i;j<=i+4;j++){
        if(s.charAt(j)==eagle.charAt(j-i)) current--;
      }
      min = Math.min(current,min);
    }
    
    sb.append(min);
    bw.write(sb.toString());
    bw.flush();
    br.close();
    bw.close();
  }
}
