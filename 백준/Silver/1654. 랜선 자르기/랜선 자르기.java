import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    StringTokenizer st = new StringTokenizer(br.readLine());
    int k = Integer.parseInt(st.nextToken());
    int n = Integer.parseInt(st.nextToken());
    int[] arr = new int[k];
    long max = 0;
    for (int i = 0; i < k; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            if (max < arr[i]) {
                max = arr[i];
            }
        }
    long min = 1;
    long mid = 0;
    while(min<=max){
      mid=(min+max)/2;
      long count =0;

      for(int i = 0;i<arr.length;i++){
        count+=(arr[i]/mid);
      }

      if(count<n){
        max = mid-1;
      }

      else{
        min=mid+1;
      }
    }
    
    sb.append(max);
    bw.write(sb.toString());
    bw.flush();
  
  }
}
