import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    String answer = br.readLine();
    Set<String> set = new HashSet<>();

    for(int i=1;i<=answer.length();i++){
      for(int j=0;j<=answer.length()-i;j++){
        String window = answer.substring(j,j+i);
        set.add(window);
      }
    }

    sb.append(set.size());    
    bw.write(sb.toString());
    bw.flush();
  
  }
}
