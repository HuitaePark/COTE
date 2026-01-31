import java.util.*;
import java.io.*;
  
public class Main{
  static int n,m;
  static StringBuilder sb = new StringBuilder();
  static int[] arr =new int[40];
  static boolean[] visited = new boolean[40];
  
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
    for(int i=start;i<=n;i++){
      if(!visited[i]){
        arr[k] = i;
        visited[i] = true;
        func(k+1,i+1);
        visited[i] = false;
      }
    }
  }
}

