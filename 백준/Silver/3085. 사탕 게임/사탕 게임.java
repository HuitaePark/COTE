import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    int n = Integer.parseInt(br.readLine());
    char[][] arr = new char[n][n];

    for(int i=0;i<n;i++){
      String s = br.readLine();
      for(int j=0;j<n;j++){
        arr[i][j] = s.charAt(j);
      }
    }

    int[] dx = {1,-1,0,0};
    int[] dy = {0,0,1,-1};
    int max = 1;
    for(int i=0;i<n;i++){
      for(int j=0;j<n;j++){
        char current = arr[i][j];
        for(int dir =0;dir<4;dir++){
          int nx = i + dx[dir];
          int ny = j + dy[dir];
          if(nx<0 || ny<0 || nx>=n || ny>=n) continue;
          if(current!=arr[nx][ny]){
            arr[i][j] = arr[nx][ny];
            arr[nx][ny] = current;
            int combo=0;
            //가로행 검사
            for(int k=0;k<n;k++){
              int currentCombo = 1;
              int currentMax = 1;
              for(int l=1;l<n;l++){
                char cur = arr[k][l];
                if(arr[k][l-1]==cur) currentCombo++;
                else{
                  combo = Math.max(combo, currentCombo);
                  currentCombo=1;
                }
              }
              combo = Math.max(combo, currentCombo);
            }
            //세로행 검사
            for(int k=0;k<n;k++){
              int currentCombo = 1;
              for(int l=1;l<n;l++){
                char cur = arr[l][k];
                if(arr[l-1][k]==cur) currentCombo++;
                else{
                  combo = Math.max(combo, currentCombo);
                  currentCombo=1;
                }
              }
              combo = Math.max(combo, currentCombo);
            }
            max = Math.max(max,combo);
            arr[nx][ny] = arr[i][j];
            arr[i][j] = current;
          }
        }
      }
    }
    
    sb.append(max);
    bw.write(sb.toString());
    bw.flush();
    br.close();
    bw.close();
  }
}
