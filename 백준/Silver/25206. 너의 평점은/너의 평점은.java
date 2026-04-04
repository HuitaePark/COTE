import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    double score = 0.0;
    double sum = 0.0;
    for(int i=0;i<20;i++){
      StringTokenizer st = new StringTokenizer(br.readLine());
      String name = st.nextToken();
      double d = Double.parseDouble(st.nextToken());
      String rank = st.nextToken();
      
      if(rank.equals("P")){
          continue;
      }
      
      score+=d;
    
      switch(rank){
        case "A+":
          sum+=(d*4.5);
          break;
        case "A0":
          sum+=(d*4.0);
          break;
        case "B+":
          sum+=(d*3.5);
          break;
        case "B0":
          sum+=(d*3.0);
          break;
        case "C+":
          sum+=(d*2.5);
          break;
        case "C0":
          sum+=(d*2.0);
          break;
        case "D+":
          sum+=(d*1.5);
          break;
        case "D0":
          sum+=(d*1.0);
          break;
        case "F":
          sum+=(d*0.0);
          break;
        default:
          continue;
        }
      }
    
    sb.append(sum/score);
    bw.write(sb.toString());
    bw.flush();
    br.close();
    bw.close();
  }
}
