import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    String input = br.readLine();
    String boom = br.readLine();
    int bSize = boom.length();
    
    for(int i = 0; i<input.length();i++){
      sb.append(input.charAt(i));
      boolean isBoom = false;
      
      if(sb.length()>=bSize && input.charAt(i) == boom.charAt(bSize-1)){
        isBoom = true;
        for(int j = 0; j<bSize; j++){
          if(sb.charAt(j+(sb.length()-bSize))!=boom.charAt(j)){
            isBoom = false;
            break;
          }
        } 
      }
      
      if(isBoom){
         sb.setLength(sb.length()-bSize); 
      }
    }

    if(sb.length()==0) sb.append("FRULA");
      
    bw.write(sb.toString());
    bw.flush();
  
  }
}

