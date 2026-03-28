import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    int n = Integer.parseInt(br.readLine());
    if(n==0){
      System.out.println(0);
      return;
    }
    
    int[] arr = new int[n];
    for(int i=0;i<n;i++){
      arr[i] = Integer.parseInt(br.readLine());
    }
    
    int cut= (int)Math.round(15.0/100*n);
    int sum = 0;
    int count = 0;
    
    Arrays.sort(arr);
    for(int i=cut;i<arr.length-cut;i++){
      count++;
      sum+=arr[i];
    }
    sb.append((int)Math.round((double)sum/count));
    
    bw.write(sb.toString());
    bw.flush();
  }
}
