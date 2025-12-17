import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    int sum = 0;
    int[] arr = new int[5]; 
    for(int i = 0;i<5;i++){
      int current = Integer.parseInt(br.readLine());
      arr[i] = current;
      sum+=current;
    }

    Arrays.sort(arr);

    sb.append(sum/5).append("\n").append(arr[2]);

    bw.write(sb.toString());
    bw.flush();
  
  }
}
