import java.util.*;
import java.io.*;
  
public class Main{
  static String[][] arr;
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    int n = Integer.parseInt(br.readLine()); 
    arr = new String[n][2*n-1];
    func(n,n-1,0);
    for(int i = 0;i<n;i++){
      for(int j = 0;j<2*n-1;j++){
        if(arr[i][j]==null)sb.append(" ");
        else sb.append(arr[i][j]);
      }
      sb.append("\n");
    }
    bw.write(sb.toString());
    bw.flush();
  }
  
  static void func(int n,int x,int y){
    if(n==3){
      arr[y][x] = "*";
      arr[y+1][x+1] = "*";
      arr[y+1][x-1] = "*";
      arr[y+2][x+2] = "*";
      arr[y+2][x+1] = "*";
      arr[y+2][x] = "*";
      arr[y+2][x-1] = "*";
      arr[y+2][x-2] = "*";
      return;
    }
    int nextSize = n / 2;
    func(nextSize,x,y);
    func(nextSize,x+nextSize,y+nextSize);
    func(nextSize,x-nextSize,y+nextSize);
  }
}
