import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    int n = Integer.parseInt(br.readLine());
    int[] arr = new int[n+1];
    StringTokenizer st = new StringTokenizer(br.readLine());
    for(int i=1;i<=n;i++){
      arr[i] = Integer.parseInt(st.nextToken());
    }
    Arrays.sort(arr);
    
    int count = 0;
    for(int i = 1;i<=n;i++){
      int index = i;
      int currentArr = arr[i];
      while(index < n && currentArr*2>arr[index+1]){
        index++;
        i = index;
      }

      count++;
    }
    sb.append(count);


     bw.write(sb.toString());
     bw.flush();
  
  }
}
