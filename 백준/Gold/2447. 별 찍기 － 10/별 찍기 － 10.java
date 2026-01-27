import java.util.*;
import java.io.*;

public class Main {
  static String[][] arr;
    
  public static void main(String[] args) throws IOException {
        
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringBuilder sb = new StringBuilder();
    int n = Integer.parseInt(br.readLine());
    arr = new String[n][n];
    
    func(0,0,n);
        for(int i=0;i<n;i++){
          for(int j=0;j<n;j++){
            if(arr[i][j]==null) sb.append(" ");
            else sb.append(arr[i][j]);
          }
          sb.append("\n");
        }
        bw.write(sb.toString());
        bw.flush();

    }
    static void func(int r, int c,int n){
      if(n==1){
        arr[r][c] = "*";
        return;
      }
      int size = n/3;
      for(int i =0;i<3;i++){
        for(int j =0;j<3;j++){
          if(i==1&&j==1) continue;
          func(r+i*size,c+j*size,size);
        }
      }
    }
}
