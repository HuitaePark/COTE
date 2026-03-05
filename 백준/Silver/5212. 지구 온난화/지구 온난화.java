import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    StringTokenizer st = new StringTokenizer(br.readLine());
    int r = Integer.parseInt(st.nextToken());
    int c= Integer.parseInt(st.nextToken());
    char[][] board = new char[r][c];
    int[] dx = {1,0,-1,0};
    int[] dy = {0,1,0,-1};
    
    //지도 채우기
    for(int i=0;i<r;i++){
      String s = br.readLine();
      for(int j=0;j<c;j++){
        board[i][j] = s.charAt(j);
      }
    }
    char[][] next = new char[r][c];

    for(int i=0;i<r;i++){
      for(int j=0;j<c;j++){
        next[i][j] = board[i][j];
      }
    }

    //조건 검사후 50년후 지도 채우기
    for(int i=0;i<r;i++){
      for(int j=0;j<c;j++){
        if(board[i][j]=='X'){
          int count = 0;
          for(int dir=0;dir<4;dir++){
            int nx = i+dx[dir];
            int ny = j+dy[dir];
            if(nx>=r || ny>=c || nx<0 || ny<0){
              count++;
              continue;
            }
            if(board[nx][ny]=='.') count++;
          }
          if(count>=3) next[i][j] = '.';
        }
      }
    }
    board = next;
    //지도 채우기
    int maxR = 0;
    int maxC = 0;
    int minR = 99;
    int minC = 99;
    for(int i=0;i<r;i++){
      for(int j=0;j<c;j++){
        if(board[i][j]=='X'){
          maxR = Math.max(i,maxR);
          maxC = Math.max(j,maxC);
          minR = Math.min(i,minR);
          minC = Math.min(j,minC);
        }
      }
    }

    for(int i = minR;i<=maxR;i++){
      for(int j=minC;j<=maxC;j++){
        sb.append(board[i][j]);
      }
      sb.append("\n");
    }
    
    bw.write(sb.toString());
    bw.flush();
  }
}
