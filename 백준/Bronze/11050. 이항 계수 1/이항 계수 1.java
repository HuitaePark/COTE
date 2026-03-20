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
    int[] arr = new int[11];
    arr[1]=1;
    for(int i=2;i<=10;i++){
      arr[i] = arr[i-1] * i;
    }
    if(n==m ||m==0) sb.append(1);
    else sb.append(
      arr[n] / (arr[m] * arr[n-m])
    );
    
    bw.write(sb.toString());
    bw.flush();
  
  }
}
