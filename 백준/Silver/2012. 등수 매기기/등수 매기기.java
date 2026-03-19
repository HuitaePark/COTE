import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    int n = Integer.parseInt(br.readLine());
    int[] arr = new int[n];
    for(int i=0;i<n;i++){
      int current = Integer.parseInt(br.readLine());
      arr[i] = current;
    }
    
    Arrays.sort(arr);
    long sum = 0;

    for(int i=0;i<n;i++){
      sum+=(long)Math.abs(arr[i]-(i+1));
    }
    sb.append(sum);
    bw.write(sb.toString());
    bw.flush();
  }
}
