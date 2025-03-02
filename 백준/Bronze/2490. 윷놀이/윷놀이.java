import java.util.*;
import java.io.*;

public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
    for(int i = 0;i<3;i++){
      StringTokenizer st = new StringTokenizer(br.readLine());
      int[] arr = new int[4];
      
      for(int j = 0;j<4;j++){
        arr[j] = Integer.parseInt(st.nextToken());
      }
      
      int count = 0;
      
      for(int j = 0;j<4;j++){
        if (arr[j]==1)
          count++;
      }
      
      
      if(count == 0){
        bw.write("D"+"\n");
      }
      else if(count == 1){
         bw.write("C"+"\n");
      }
      else if(count == 2){
         bw.write("B"+"\n");
      }
      else if(count == 3){
         bw.write("A"+"\n");
      }
      else if(count == 4){
         bw.write("E"+"\n");
      }
    }
  

     bw.flush();  
  
  
    
  }
}
