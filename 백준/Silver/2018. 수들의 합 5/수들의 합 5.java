import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    int n = Integer.parseInt(br.readLine());
    int start = 1;
    int end = 1;
    int count = 1;
    int sum =1;
    
    while(end!=n){
      if(sum==n){
        count++;
        end+=1;
        sum+=end;
      }
      else if(sum<n){
        end+=1;
        sum+=end;
      }
      else{
        sum-=start;
        start++;
      }
    }
    
    sb.append(count);
    bw.write(sb.toString());
    bw.flush();
  
  }
}
