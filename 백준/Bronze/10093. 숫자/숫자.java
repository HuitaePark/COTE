import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    StringTokenizer st = new StringTokenizer(br.readLine());
    long a = Long.parseLong(st.nextToken());
    long b = Long.parseLong(st.nextToken());
    long start;
    long end;
    
    if(a >b){
      end = a;
      start = b;
    } 
    else {      
      end = b;
      start = a;
    }
    
    if(start == end) sb.append(0).append("\n");
    else sb.append(end-start-1).append("\n");
     
    for(long i = start+1;i<end;i++){
       sb.append(i).append(" ");
     }


    bw.write(sb.toString());
    bw.flush();
  
  }
}
