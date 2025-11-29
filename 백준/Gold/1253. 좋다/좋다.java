import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    int n = Integer.parseInt(br.readLine());
    long[] arr = new long[n];
    int count = 0;
    
    
    StringTokenizer st = new StringTokenizer(br.readLine());
    for(int i = 0;i<n;i++){
      arr[i] = Long.parseLong(st.nextToken());
    }
    Arrays.sort(arr);

    for(int k = 0;k<n;k++){
      int i = 0;
      int j = n-1;
      long find = arr[k];
      while(i<j){
        if(arr[i]+arr[j]==find){
          if(i!=k && j!=k){
            count++;
            break;
          }
          else if(i==k){
            i++;
          }
          else if(j==k){
            j--;
          }
        }
        else if(arr[i]+arr[j]<find){
           i++;
        }
        else{
           j--;
        }
      }
    }
    
    


    sb.append(count);
    bw.write(sb.toString());
    bw.flush();
  
  }
}
