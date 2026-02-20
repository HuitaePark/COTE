import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb1 = new StringBuilder();
    String s = br.readLine();
    int combo = 0;
    boolean isFail = false;
    for(int i=0;i<s.length();i++){
      if(s.charAt(i)=='X'){
        combo++;
        if(combo==4){
          sb1.append("AAAA");
          combo=0;
        }
      }
      else if(s.charAt(i)=='.'){
        if(combo==0) sb1.append(".");
        else if(combo==2){
          sb1.append("BB");
          combo=0;
          sb1.append(".");
        }
        else if(combo%4!=0 && combo%2!=0){
          isFail = true;
          break;
        }

      }
    }
    if(combo==2){
      sb1.append("BB");
    }
    else if(combo==1 || combo==3){
      isFail = true;
    }
    
    if(isFail){
      bw.write(Integer.toString(-1));
      bw.flush();
    }
    else{
      bw.write(sb1.toString());
      bw.flush();
    }
  }
}
