import java.util.*;
import java.io.*;
  
public class Main{
  
  static int[][] arr;
  static Map<Integer,Long> map = new HashMap<>();
  
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    int n = Integer.parseInt(br.readLine());
    arr = new int[n][n];
    
    for(int i =0;i<n;i++){
      StringTokenizer st = new StringTokenizer(br.readLine());
      for(int j=0;j<n;j++){
        arr[i][j] = Integer.parseInt(st.nextToken());
      }
    }
    map.put(-1,0L);
    map.put(0,0L);
    map.put(1,0L);
    
    func(0,0,n);

    sb.append(map.get(-1)).append("\n").append(map.get(0)).append("\n").append(map.get(1));

    bw.write(sb.toString());
    bw.flush();
  }
  static void func(int r,int c,int n){
    if(n==1){
      map.put(arr[r][c],map.get(arr[r][c])+1L);
      return;
    }
    
    int start = arr[r][c];
    boolean isUnMatch = false;
    
    a:for(int i =r;i<r+n;i++){
      for(int j=c;j<c+n;j++){
        if(arr[i][j]!=start){
          isUnMatch = true;
          break a;
        }
      }
    }
    if(isUnMatch){
          func(r,c,n/3);
          func(r,c+n/3,n/3);
          func(r,c+n/3*2,n/3);
          func(r+n/3,c,n/3);
          func(r+n/3,c+n/3,n/3);
          func(r+n/3,c+n/3*2,n/3);
          func(r+n/3*2,c,n/3);
          func(r+n/3*2,c+n/3,n/3);
          func(r+n/3*2,c+n/3*2,n/3);
      }
      else{
        map.put(start,map.get(start)+1L);
      }
  }
  
}
