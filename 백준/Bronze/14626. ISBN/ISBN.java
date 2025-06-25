import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    String isbn = br.readLine();
    int sum = 0;
    int index = 0;
    for(int i =0;i<12;i++){
      char ch = isbn.charAt(i);
      if(ch!='*'){
        sum += ((i + 1) % 2 == 0) ? Character.getNumericValue(ch) * 3 : Character.getNumericValue(ch);
      }
      else{
        index = i+1;
      }
    }
    
    int m = Character.getNumericValue(isbn.charAt(isbn.length()-1));
    
    for(int i=0;i<10;i++){
      if (index % 2 == 0 && (10 - (sum + i * 3) % 10) % 10 == m) {
            sb.append(i);
            break; // 답을 찾으면 종료
        }
      else if (index % 2 != 0 && (10 - (sum + i) % 10) % 10 == m) {
            sb.append(i);
            break; // 답을 찾으면 종료
        }
    }
    
    

     bw.write(sb.toString());
     bw.flush();
  
  }
}
