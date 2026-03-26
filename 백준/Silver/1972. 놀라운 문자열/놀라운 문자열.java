import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    
    String line = "";
    while(!(line = br.readLine()).equals("*")){
      boolean isSuprise = true;
      int couple = line.length() - 2;
      
      a:for(int i=0;i<=couple;i++){
        Set<String> set = new HashSet<>();

        for(int j=0;j<line.length();j++){
          if(j+i+1>=line.length()) break;
          
          String current = "" + line.charAt(j) + line.charAt(j + i + 1);
          if(set.contains(current)){
            isSuprise = false;
            break a;
          }
          else{
            set.add(current);
          }
        }
      }
      if(isSuprise) sb.append(line).append(" is surprising.\n");
      else sb.append(line).append(" is NOT surprising.\n");
    }
    bw.write(sb.toString());
    bw.flush();
    br.close();
    bw.close();
  }
}
