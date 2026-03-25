import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    StringTokenizer st = new StringTokenizer(br.readLine());
    int r = Integer.parseInt(st.nextToken());
    int c = Integer.parseInt(st.nextToken());
    int[][] arr = new int[r][c];
    
    st = new StringTokenizer(br.readLine());
    for(int i=0;i<c;i++){
      int current = Integer.parseInt(st.nextToken());
      for(int j=0;j<current;j++){
        arr[j][i] = -1; //땅을 0부터 쌓음
      }
    }

    for(int i=0;i<r;i++){
      for(int j=0;j<c-1;j++){
        if(arr[i][j]==-1){
          int current = j;
          int[] copy = arr[i].clone(); //마주친 벽의 높이만큼 탐색
          boolean isRainny = false; 
          boolean success = false;
          for(int k = current+1;k<copy.length;k++){ 
            if(copy[k]==-1){
              if(isRainny){
                success = true;
                break;
              }
              else break;
            }
            else if(copy[k]==0){
              copy[k] = 1;
              isRainny = true; //비를 채울수 있는 조건이면 true;
            }
          }

          if(isRainny && success) arr[i] = copy;          
        }
      }
    }

    int count = 0;
    for(int i=0;i<r;i++){
      for(int j=0;j<c;j++){
        if(arr[i][j]==1) count++;
      }
    }
    
    sb.append(count);

    bw.write(sb.toString());
    bw.flush();
    br.close();
    bw.close();
  }
}
