import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    int n = Integer.parseInt(br.readLine());
    int[] arr= new int[n];
    for(int i=0;i<n;i++){
      arr[i] = Integer.parseInt(br.readLine());
    }
    Arrays.sort(arr);
    int avg = (int)Math.round(n*0.15);
    int sum = 0;
    int count = 0;
    for(int i =avg;i<n-avg;i++){
      sum+=arr[i];
      count++;
    }
     
    double answer =(double)sum/count;
    sb.append(Math.round(answer));

     bw.write(sb.toString());
     bw.flush();
  
  }
}
