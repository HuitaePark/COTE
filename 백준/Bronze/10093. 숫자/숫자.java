import java.util.*;
import java.io.*;

public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());
    long a = Long.parseLong(st.nextToken());
    long b = Long.parseLong(st.nextToken());
    if(a > b) {
      long temp = 0;
      temp = b;
      b = a;
      a= temp;
    }
    if(a == b || b - a == 1){
      bw.write(Long.toString(0)+"\n");
    }
    else{
    bw.write(Long.toString(b-a-1)+"\n");
    }
    
    for(long i =a+1;i<b;i++){
      bw.write(Long.toString(i)+" ");
    }
    
    bw.flush();
  }
}
