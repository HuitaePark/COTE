import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    int n = Integer.parseInt(br.readLine());
    for(int i = 0;i<n;i++){
      StringTokenizer st = new StringTokenizer(br.readLine());
      int west = Integer.parseInt(st.nextToken());
      int east = Integer.parseInt(st.nextToken());
      long answer = 1;
      for (int j = 0; j < west; j++) {
          answer = answer * (east - j) / (j + 1);
      }
      sb.append(answer).append("\n");
    }



     bw.write(sb.toString());
     bw.flush();
  
  }
}
