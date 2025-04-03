import java.util.*;
import java.io.*;

public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringBuilder sb = new StringBuilder();

    int max = 0;
    int columm = 0;
    int row = 0;

    for(int i=0;i<9;i++){
      StringTokenizer st = new StringTokenizer(br.readLine());
      for(int j =0;j<9;j++){
        int n = Integer.parseInt(st.nextToken());
        if(n>max){
          max = n;
          columm = i;
          row = j;
        }
      }
    }
    columm++;
    row++;
    
    sb.append(max + "\n" + columm + " " + row);

    bw.write(sb.toString());
    bw.flush();
  }
}
