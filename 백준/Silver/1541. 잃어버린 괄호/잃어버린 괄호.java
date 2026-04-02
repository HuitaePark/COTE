import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
      StringBuilder sb = new StringBuilder();
      String s = br.readLine();
      String[] arr = s.split("\\-");
        
      int sum = Arrays.stream(arr[0].split("\\+"))
          .mapToInt(Integer::parseInt)
          .sum();
        
      if(arr.length==0){
          System.out.println(sum);
          return;
        }
      for(int i = 1;i<arr.length;i++){
        int current = Arrays.stream(arr[i].split("\\+"))
          .mapToInt(Integer::parseInt)
          .sum();
        sum-=current;
      } 
      sb.append(sum);
      bw.write(sb.toString());  
      bw.flush();
    }
}