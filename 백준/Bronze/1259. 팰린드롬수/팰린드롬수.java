import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    while(true){
      String s = br.readLine();
      if(s.equals("0")) break;

      boolean isMatched = true;
      int j = s.length()-1;
      int i = 0;
      while(i<=j){
        if(s.charAt(i) != s.charAt(j)){
          isMatched = false;
          break;
        }
        j--;
        i++;
      }
      if(isMatched) sb.append("yes").append("\n");
      else sb.append("no").append("\n");
    }

    bw.write(sb.toString());
    bw.flush();
  }
}
