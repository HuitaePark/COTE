import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();

    int sum = 0;
    int min = Integer.MAX_VALUE;
    for(int i = 0;i<7;i++){
      int current = Integer.parseInt(br.readLine());
      if(current%2==1){
        sum+=current;
        if(current<min) min = current;
      }
    }

    if(sum==0) sb.append(-1);
    else sb.append(sum).append("\n").append(min);



    bw.write(sb.toString());
    bw.flush();
  
  }
}
