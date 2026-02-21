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
      arr[i] = Integer.parseInt(br.readLine());
    }
    int sum = 0;
    Arrays.sort(arr);
    int count = 1;
    for(int i=arr.length-1;i>=0;i--){
      if(count==3){
        count=1;
        continue;
      }
      else{
        sum+=arr[i];
        count++;
      }
    }
    sb.append(sum);
    bw.write(sb.toString());
    bw.flush();
  }
}
