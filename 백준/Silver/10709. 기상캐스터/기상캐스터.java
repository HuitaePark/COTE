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
    for(int i=0;i<r;i++){
      String s = br.readLine();
      for(int j=0;j<c;j++){
        if(s.charAt(j)=='c') arr[i][j] = 0;
        else arr[i][j] = -1;
      }
    }
   
    
    for(int i=0;i<r;i++){
      boolean isCloud = false;
      int start = 0;
      for(int j=0;j<c;j++){
        if(arr[i][j]>0) continue;
        if(arr[i][j]==0){
          start = 0;
          isCloud = true;
        }
        else if(isCloud){
          arr[i][j] = start+1;
          start++;
        }
      }
    }

    for(int i=0;i<r;i++){
      for(int j=0;j<c;j++){
        sb.append(arr[i][j]).append(" ");
      }
      sb.append("\n");
    }
    
    bw.write(sb.toString());
    bw.flush();
  }
}
