import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();

    for(int i = 0;i<3;i++){
      StringTokenizer st = new StringTokenizer(br.readLine());
      int zero = 0;
      int one = 0;
      
      for(int j = 0;j<4;j++){
        int idx = Integer.parseInt(st.nextToken());
        if(idx == 1) one ++;
        else zero++;
      }
      
      switch(one){
        case 1:
          sb.append("C").append("\n");
          break;
        case 2:
          sb.append("B").append("\n");
          break;
        case 3:
          sb.append("A").append("\n");
          break;
        case 4:
          sb.append("E").append("\n");
          break;
        case 0:
          sb.append("D").append("\n");
          break;
      }      
    }




    bw.write(sb.toString());
    bw.flush();
  
  }
}
