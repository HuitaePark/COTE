import java.util.*;
import java.io.*;
  
public class Main{
  static int[] arr;
  static boolean[] visited;
  static int[] selected;
  static int k,n;
  static Set<String> set = new HashSet<>();

  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    n = Integer.parseInt(br.readLine());
    k = Integer.parseInt(br.readLine());
    visited = new boolean[n]; 
    selected = new int[k];    
    arr = new int[n];
    
    for(int i=0;i<n;i++){
      arr[i] = Integer.parseInt(br.readLine());
    }
    
    func(0);
    sb.append(set.size());
    
    bw.write(sb.toString());
    bw.flush();
    br.close();
    bw.close();
  }
  static void func(int x){
    if(x==k){
      StringBuilder temp = new StringBuilder();
      for(int i=0;i<k;i++){
        temp.append(arr[selected[i]]);
      }
      set.add(temp.toString());
      return;
    }
    for(int i=0;i<n;i++){
      if(visited[i]) continue;
      visited[i]=true;
      selected[x] = i;
      func(x+1);
      visited[i]=false;
    }
  }
}
