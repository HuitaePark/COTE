import java.util.*;
import java.io.*;
  
public class Main{
  static int[] arr = new int[40];
  static int n,m;
  static StringBuilder sb = new StringBuilder();
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringTokenizer st = new StringTokenizer(br.readLine());
    n = Integer.parseInt(st.nextToken());
    m = Integer.parseInt(st.nextToken());
    func(0,1);
    bw.write(sb.toString());
    bw.flush();
  }
  static void func(int k,int start){
    if(k==m){
      for(int i =0;i<m;i++){
        sb.append(arr[i]).append(" ");
      }
      sb.append("\n");
      return;
    }
    
    for(int i = start;i<=n;i++){
      arr[k] = i;
      func(k+1,i);
    }
  }
}

