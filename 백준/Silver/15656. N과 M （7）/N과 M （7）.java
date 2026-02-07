import java.util.*;
import java.io.*;
  
public class Main{
  static int n,m;
  static StringBuilder sb  = new StringBuilder();
  static int[] arr;
  static int[] temp = new int[40];
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringTokenizer st = new StringTokenizer(br.readLine());
    n = Integer.parseInt(st.nextToken());
    m = Integer.parseInt(st.nextToken());
    arr = new int[n];
    st = new StringTokenizer(br.readLine());
    for(int i = 0;i<n;i++){
      arr[i] = Integer.parseInt(st.nextToken());
    }
    Arrays.sort(arr);
    func(0);
    bw.write(sb.toString());
    bw.flush();
  }
  static void func(int k){
    if(k==m){
      for(int i = 0;i<m;i++){
        sb.append(temp[i]).append(" ");
      }
      sb.append("\n");
      return;
    }
    for(int i = 0;i<n;i++){
       temp[k] = arr[i];
       func(k+1);
    }
  }
}
