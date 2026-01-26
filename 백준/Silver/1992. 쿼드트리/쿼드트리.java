import java.util.*;
import java.io.*;
  
public class Main{

  static char[][] arr;
  static StringBuilder sb = new StringBuilder();
  
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    int n = Integer.parseInt(br.readLine());
    arr = new char[n][n];

    for(int i = 0;i<n;i++){
      String s = br.readLine();
      for(int j =0;j<n;j++){
        arr[i][j] = s.charAt(j); 
      }
    }

    func(0,0,n);
    
    bw.write(sb.toString());
    bw.flush();
  }

  static void func(int r, int c, int n){
    char start = arr[r][c];
    boolean isMatched = true;
    
    for (int i = r; i < r + n; i++) {
        for (int j = c; j < c + n; j++) {
            if (arr[i][j] != start) {
                isMatched = false;
                break;
            }
        }
        if (!isMatched) break;
    }

    if (isMatched) {
        sb.append(start);
        return;
    }

    sb.append("(");
    int half = n / 2;
    
    func(r, c, half);              // 왼쪽 위
    func(r, c + half, half);       // 오른쪽 위
    func(r + half, c, half);       // 왼쪽 아래
    func(r + half, c + half, half); // 오른쪽 아래

    sb.append(")");
  }
}
