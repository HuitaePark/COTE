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
    for(int i=0;i<n;i++){
      arr[i] = Integer.parseInt(st.nextToken());
    }
    Arrays.sort(arr);
    int count = 0;
    int prev = 0;
    int combo = 0;
    for(int i=0; i<n; i++){
       if(combo == 0 && prev == 0){
         combo++;
         prev = arr[i];
       }
       else{
         if(combo + (arr[i] - prev) > m){
           count++;          
           combo = 1;       
           prev = arr[i];    
         }
         else{
           combo += arr[i] - prev; 
           prev = arr[i];
         }
       }
    }
    if(combo>0) count++;
    sb.append(count);
    bw.write(sb.toString());
    bw.flush();
  }
}