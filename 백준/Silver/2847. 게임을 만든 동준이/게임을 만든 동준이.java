import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    int n = Integer.parseInt(br.readLine());
    int[] arr =  new int[n];
    for(int i=0;i<n;i++){
      arr[i] = Integer.parseInt(br.readLine());
    }
    int count = 0;
    
    for(int i=n-2;i>=0;i--){
      while(arr[i]>=arr[i+1]){
        count++;
        arr[i]--;
      }
    }
    
    sb.append(count);
    bw.write(sb.toString());
    bw.flush();
    br.close();
    bw.close();
  }
}
