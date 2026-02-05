import java.util.*;
import java.io.*;
  
public class Main{
  static StringBuilder sb = new StringBuilder();
  static int n,m;
  static int[] arr = new int[40];
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());
    n = Integer.parseInt(st.nextToken());
    m = Integer.parseInt(st.nextToken());
    func(0);
    bw.write(sb.toString());
    bw.flush();
  }
  static void func(int k){
    if(k==m){
      for(int i = 0;i<m;i++){
        sb.append(arr[i]).append(" ");
      }
      sb.append("\n");
      return;
    }

    for(int i = 1;i<=n;i++){
      arr[k] = i;
      func(k+1);
    }
  }
}
