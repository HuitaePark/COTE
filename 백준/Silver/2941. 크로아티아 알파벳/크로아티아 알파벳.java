import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    int count = 0;
    String s= br.readLine();
    for(int i=0;i<s.length();i++){
      if(i+2 < s.length() && s.substring(i,i+3).equals("dz=")){
        count++;
        i += 2;
      }
      else if(i+1<s.length()){
        String current = s.substring(i,i+2);
        if(current.equals("c=")||
          current.equals("c-")||
          current.equals("d-")||
          current.equals("lj")||
          current.equals("nj")||
          current.equals("s=")||
          current.equals("z=")){
          count++;
          i++;
          }
          else count++;
      }
      else count++;
    }
    sb.append(count);
    bw.write(sb.toString());
    bw.flush();
  }
}
