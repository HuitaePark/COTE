import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();

    int n = Integer.parseInt(br.readLine());
    int sum = 1;
    int count = 1;

    int startIndex = 1;
    int endIndex = 1;

    int[] arr = new int[n+1];
    for(int i =1;i<=n;i++){
      arr[i] = i;
    }

    while(endIndex!=n){
      if(sum==n){
        count++;
        endIndex++;
        sum+=arr[endIndex];
      }
      else if(sum>n){
        sum-=arr[startIndex];
        startIndex++;
      }
      else if(sum<n){
        endIndex++;
        sum+=arr[endIndex];
      }
    }

    sb.append(count);

    bw.write(sb.toString());
    bw.flush();
  
  }
}
