import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    int n = Integer.parseInt(br.readLine());
    long count = 0;
    
    for(int i=1;i<=n;i++){
      if(i<10) count++;
      else if(i<100) count+=2L;
      else if(i<1000) count+=3L;
      else if(i<10000) count+=4L;
      else if(i<100000) count+=5L;
      else if(i<1000000) count+=6L;
      else if(i<10000000) count+=7L;
      else if(i<100000000) count+=8L;
      else count+=9L;
    }
    
    sb.append(count);
    bw.write(sb.toString());
    bw.flush();
    br.close();
    bw.close();
  }
}
