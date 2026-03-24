import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    int[] b = new int[n];
    StringTokenizer st = new StringTokenizer(br.readLine());
    for(int i=0;i<n;i++){
      a[i] = Integer.parseInt(st.nextToken());
    }
    
    st = new StringTokenizer(br.readLine());
    for(int i=0;i<n;i++){
      b[i] = Integer.parseInt(st.nextToken());
    }

    Arrays.sort(a);
    Arrays.sort(b);

    int sum = 0;
    
    for(int i=0;i<n;i++){
      sum += (a[i] * b[n-i-1]);
    }

    sb.append(sum);
    
    bw.write(sb.toString());
    bw.flush();
    br.close();
    bw.close();
  }
}
