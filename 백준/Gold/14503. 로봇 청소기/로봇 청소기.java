import java.util.*;
import java.io.*;
  
public class Main{
  static int[][] arr;
  static int n,m;
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    StringTokenizer st = new StringTokenizer(br.readLine());
    n = Integer.parseInt(st.nextToken());
    m = Integer.parseInt(st.nextToken());
    
    st = new StringTokenizer(br.readLine());
    int r = Integer.parseInt(st.nextToken());
    int c = Integer.parseInt(st.nextToken());
    int d = Integer.parseInt(st.nextToken());
    
    arr = new int[n][m];
    for(int i=0;i<n;i++){
      st = new StringTokenizer(br.readLine());
      for(int j=0;j<m;j++){
        arr[i][j] = Integer.parseInt(st.nextToken());
      }
    }

    int count =0;

    while(true){
      if(arr[r][c]==0){
        arr[r][c] = -1;
        count++;
      }
      else if(isDirty(r,c)){
        d = (d+3)%4;
        if(d==0 && r>0 && arr[r-1][c]==0) r--;
        else if(d==1 && c<m-1 && arr[r][c+1]==0) c++;
        else if(d==2 && r<n-1 && arr[r+1][c]==0) r++;
        else if(d==3 && c>0 && arr[r][c-1]==0) c--;
      }
      else{
        if(d==0){
          if(r<n-1){
            if(arr[r+1][c]==1) break;
            else r++;
          }
          else break;
        } 
        if(d==1){
          if(c>0){
            if(arr[r][c-1]==1) break;
            else c--;
          }
          else break;
        }
        if(d==2){
          if(r>0){
            if(arr[r-1][c]==1) break;
            else r--;
          }
          else break;
        }
        if(d==3){
          if(c<m-1){
            if(arr[r][c+1]==1) break;
            else c++;
          }
          else break;
        }
      }
    }
    sb.append(count);    
    bw.write(sb.toString());
    bw.flush();
  }
  static boolean isDirty(int r, int c){
    int[] dr = {1,-1,0,0};
    int[] dc = {0,0,1,-1};
    for(int dir=0;dir<4;dir++){
      int nr = r + dr[dir];
      int nc = c + dc[dir];
      if(nr<0 || nr>=n || nc<0 || nc>=m) continue;
      if(arr[nr][nc]==0) return true;
    }
    return false;
  }
}

