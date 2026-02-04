import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    int k = Integer.parseInt(st.nextToken());
    int[] arr = new int[n];
    String[] s = br.readLine().split(",");
    
    for(int i = 0;i<n;i++){
      arr[i] = Integer.parseInt(s[i]);
    }
    while(k>0){
      for(int i = 0;i<n-1;i++){
        arr[i] = arr[i+1] - arr[i];
      }
      k--;
      n--;
    }
    for(int i = 0;i<n;i++){
      sb.append(arr[i]).append(",");
    }
    sb.deleteCharAt(sb.length()-1);
    bw.write(sb.toString());
    bw.flush();
  }
}
