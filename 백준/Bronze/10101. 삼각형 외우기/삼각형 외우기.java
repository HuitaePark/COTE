import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    int sum = 0;
    int[] arr = new int[181];
    
    for(int i = 0;i<3;i++){
      int n = Integer.parseInt(br.readLine());
      sum+=n;
      arr[n]++;
    }
    
    if(sum!=180){
      sb.append("Error");
    }
    else if(arr[60]==3){
      sb.append("Equilateral");
    }
    else{
      for(int i=0;i<arr.length;i++){
        if(sum==180 && arr[i]==2){
          sb.append("Isosceles");
        }
      }
    }
    if(sb.length()==0){
      sb.append("Scalene");
    }

     bw.write(sb.toString());
     bw.flush();
  
  }
}
