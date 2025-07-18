import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());
    
    int[] arr = new int[n];
    st = new StringTokenizer(br.readLine());
    long min = 0;
    long max = 0;
    for(int i =0;i<n;i++){
      arr[i] = Integer.parseInt(st.nextToken());
      if(arr[i]>max) max = arr[i];
    
    }

    while(min<=max){
      long sum = 0;
      long mid = (min+max)/2;
      
      for(int tree : arr){
        if(tree>mid){
        sum += (tree-mid);
        }
      }

      if(sum<m) max = mid-1;
      else min = mid+1;
      
    }
        
    sb.append(max);
    bw.write(sb.toString());
    bw.flush();
  
  }
}
