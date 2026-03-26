import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    int n = Integer.parseInt(br.readLine());
    long[] arr = new long[n];

    StringTokenizer st = new StringTokenizer(br.readLine());
    for(int i=0;i<n;i++){
      long current = Long.parseLong(st.nextToken());
      arr[i] = current;
    }

    Arrays.sort(arr);
    int count = 0;
    for(int i=0;i<n;i++){
      long current = arr[i];
      int start = 0;
      int end = n-1;
      while(start<end){
        if(start==i){
          start++;
          continue;
        }
        else if(end==i){
          end--;
          continue;
        }
        else{
          if(arr[start]+arr[end] == current){
            count++;
            break;
          }
          else if(arr[start]+arr[end]>current) end--;
          else start++;
        }
      }  
    }
    
    sb.append(count);
    bw.write(sb.toString());
    bw.flush();
    bw.close();
    br.close();
  }
}
