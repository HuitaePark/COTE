import java.util.*;
import java.io.*;
  
public class Main {
  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    StringTokenizer st = new StringTokenizer(br.readLine());
    
    int n = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());
    int[] arr = new int[n + 1];
    
    for(int i = 0; i <= n; i++){
      arr[i] = i;
    }
    int count = 0;
    
    a: for(int i = 2; i <= n; i++){
      if(arr[i] == -1) continue; 
      for(int j = i; j <= n; j += i){
        if(arr[j] != -1) {
          arr[j] = -1;
          count++;
          if(count == m){
            sb.append(j);
            break a;
          }
        }
      }
    }
    
    bw.write(sb.toString());
    bw.flush();
    br.close();
    bw.close();
  }
}