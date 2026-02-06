import java.util.*;
import java.io.*;
  
public class Main{
  static int[] arr;
  static int[] squence = new int[40];
  static boolean[] visited = new boolean[40];
  static int n,m;
  static StringBuilder sb = new StringBuilder();
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringTokenizer st = new StringTokenizer(br.readLine());
    n = Integer.parseInt(st.nextToken());
    m = Integer.parseInt(st.nextToken());
    arr = new int[n];
    st = new StringTokenizer(br.readLine());
    for(int i=0;i<n;i++){
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
        sb.append(squence[i]).append(" ");
      }
      sb.append("\n");
      return;
    }
    for(int i =0;i<n;i++){
      if(visited[i]) continue;
      visited[i] = true;
      squence[k] = arr[i];
      func(k+1);
      visited[i] = false;
    }
  }
}
