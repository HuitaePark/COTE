import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());
    char[][] board = new char[n][m];
    boolean[][] visited = new boolean[n][m];
    
    for(int i =0;i<n;i++){
      String s = br.readLine();
      for(int j =0;j<m;j++){
        board[i][j] = s.charAt(j);
      }
    }

    int count = 0;
    for(int i =0;i<n;i++){
      for(int j =0;j<m;j++){
        char current = board[i][j];
        if(visited[i][j]) continue;
        if(current=='-'){
          int currentIndex = j;
          while(currentIndex < m && board[i][currentIndex] == '-'){
            visited[i][currentIndex] = true;
            currentIndex++;
          } 
          count++;
        }
        else if(current=='|'){
          int currentIndex = i;
          while(currentIndex < n && board[currentIndex][j] == '|'){
            visited[currentIndex][j] = true;
            currentIndex++;
          } 
          count++;
        }
      }
    }
    
    sb.append(count);
    bw.write(sb.toString());
    bw.flush();
  }
}
