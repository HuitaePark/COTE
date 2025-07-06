import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    int n = Integer.parseInt(br.readLine());

    StringTokenizer st = new StringTokenizer(br.readLine());
    int[] arr = new int[n];
    for(int i=0;i<n;i++){
      arr[i] = Integer.parseInt(st.nextToken());
    }
    
    Arrays.sort(arr);
    int sum = 0;
    int temp = 0;
    for(int i=0;i<n;i++){
       temp+=arr[i];
       sum+=temp;
    }

     sb.append(sum);

     bw.write(sb.toString());
     bw.flush();
  
  }
}
