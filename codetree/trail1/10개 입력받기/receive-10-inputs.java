import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    
    StringTokenizer st = new StringTokenizer(br.readLine());
    int sum = 0;
    int count = 0;
    for(int i=0;i<10;i++){
        int current = Integer.parseInt(st.nextToken());
        if(current==0) break;
        sum+=current;
        count++;
    }

    sb.append(sum).append(" ").append(String.format("%.1f",(double)sum/count));

    bw.write(sb.toString());
    bw.flush();
    br.close();
    bw.close();
  }
}