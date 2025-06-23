import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    int n = Integer.parseInt(br.readLine());
    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;
    StringTokenizer st = new StringTokenizer(br.readLine());
    for(int i = 0;i<n;i++){
      int m = Integer.parseInt(st.nextToken());
      if(m>max){
        max = m;
      }
      if(m<min){
        min = m;
      }
      
    }

    if(n==1){
      sb.append(max*max);
    }
    else{
    sb.append(max*min);
    }




     bw.write(sb.toString());
     bw.flush();
  
  }
}
