import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    int n = Integer.parseInt(br.readLine());
    if(n==0){
      sb.append(1);
    }
    else{
      int sum = 1;
      for(int i =n;i>0;i--){
        sum*=i;
      }
      sb.append(sum);
    }
    




     bw.write(sb.toString());
     bw.flush();
  
  }
}
