import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    int n = Integer.parseInt(br.readLine());
    int m = Integer.parseInt(br.readLine());
    int count = 0;
    int[] arr = new int[n];
    
    StringTokenizer st = new StringTokenizer(br.readLine());
    for(int i = 0;i<n;i++){
      arr[i] = Integer.parseInt(st.nextToken());
    }
    Arrays.sort(arr);
    
    int i = 0;
    int j = n-1;
    while(i<j){
      if(arr[i]+arr[j]<m){
        i++;
      }
      else if(arr[i]+arr[j]>m){
        j--;
      } 
      else if(arr[i]+arr[j]==m){
        count++;
        i++;
        j--;
      }
    }
    
    
    sb.append(count);



    bw.write(sb.toString());
    bw.flush();
  
  }
}
