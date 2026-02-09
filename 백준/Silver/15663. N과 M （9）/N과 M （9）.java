import java.util.*;
import java.io.*;
  
public class Main{
  static int n,m;
  static int[] arr;
  static boolean[] used = new boolean[30];
  static int[] temp = new int[30];
  static StringBuilder sb = new StringBuilder();
  
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringTokenizer st = new StringTokenizer(br.readLine());
    n = Integer.parseInt(st.nextToken());
    m = Integer.parseInt(st.nextToken());
    arr= new int[n];
    
    st = new StringTokenizer(br.readLine());
    for(int i = 0;i<n;i++){
      arr[i]= Integer.parseInt(st.nextToken());
    }
    
    Arrays.sort(arr);
    func(0);
    bw.write(sb.toString());
    bw.flush();
  }
  static void func(int k){
    if(k==m){
      for(int i =0;i<m;i++){
        sb.append(temp[i]).append(" ");
      }
      sb.append("\n");
      return;
    }

    int prev = -1;
    
    for(int i =0;i<n;i++){
      if(used[i]) continue;
      if(arr[i]==prev) continue;
      temp[k] = arr[i];
      used[i] = true;
      prev = arr[i];
      
      func(k+1);
      used[i] = false;
    }
  }
}
