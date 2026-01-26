import java.util.*;
import java.io.*;
  
public class Main{
  
  static int n;
  static int[][] arr;
  static int blue = 0;
  static int white = 0;
  static int[] wb = new int[2];
  
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    n = Integer.parseInt(br.readLine());
    arr = new int[n][n];

    for(int i =0;i<n;i++){
      StringTokenizer st = new StringTokenizer(br.readLine());
      for(int j=0;j<n;j++){
        arr[i][j] = Integer.parseInt(st.nextToken());
      }
    }

    
    func(0,0,n);
    sb.append(white).append("\n").append(blue);
    bw.write(sb.toString());
    bw.flush();
  }
  
  static void func(int r,int c,int n){
    int start = arr[r][c];
    
    if(n==1){
      if(start == 0) white++;
      else blue++;
      return;
    }

    boolean isMatched = true;
    a:for(int i =r;i<r+n;i++){
      for(int j=c;j<c+n;j++){
        if(arr[i][j]!=start){
          func(r,c,n/2);
          func(r+n/2,c,n/2);
          func(r,c+n/2,n/2);
          func(r+n/2,c+n/2,n/2);
          isMatched = false;
          break a;
        }
      }
    }

    if(isMatched){
      if(start==0){
        white++;
      }
      else{
        blue++;
      }
    }
  }
}

