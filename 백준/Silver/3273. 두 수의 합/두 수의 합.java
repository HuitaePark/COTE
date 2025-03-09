import java.util.*;
import java.io.*;

public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int count = 0;
    int n = Integer.parseInt(br.readLine());
    int[] arr = new int[n];
    StringTokenizer st = new StringTokenizer(br.readLine());
    for(int i = 0; i<n;i++){
      arr[i] = Integer.parseInt(st.nextToken());
    }
    int begin =0;
    int end =n-1;
    int x = Integer.parseInt(br.readLine());
    
    Arrays.sort(arr);
    
    while(begin<end){
      int sum = arr[begin]+arr[end];

      if(arr[begin]+arr[end] == x){
        count++;
        begin++;
        end--;
      }
      else if(sum < x){
        begin++;
      }
      else{
        end--;
      }
        
    }
    
    bw.write(Integer.toString(count));  
    bw.flush();
  }
}
