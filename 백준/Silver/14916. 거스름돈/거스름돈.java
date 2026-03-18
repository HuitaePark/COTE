import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    int n = Integer.parseInt(br.readLine());
    int count = Integer.MAX_VALUE;
    int combo = 0;

    while(combo*5<=n){
      int currentCount = 0;
      if((n-(combo*5))%2==0){
        currentCount+=combo;
        currentCount+=(n-(combo*5))/2;
        count = Math.min(count,currentCount);
      }
      combo++;
    }
    
    if(count==Integer.MAX_VALUE) sb.append(-1);
    else sb.append(count);

    bw.write(sb.toString());
    bw.flush();
  }
}
