import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    int n = Integer.parseInt(br.readLine());
    int[][] arr = new int[n][5];
    for(int i = 0;i<n;i++){
      StringTokenizer st = new StringTokenizer(br.readLine());
      for(int j =0;j<5;j++){
        arr[i][j] = Integer.parseInt(st.nextToken());
      }
    }
    boolean[][] isFriend = new boolean[n][n];
    int[] sameClassCount = new int[n];
    int current = 0;
    for(int j =0;j<5;j++){ //학년
      for(int i =0;i<n;i++){//학생
        current = arr[i][j];
        for(int k = 0;k<n;k++){
          if(k==i) continue;
          if(arr[k][j] == arr[i][j] && !isFriend[i][k]){
            isFriend[i][k] = true;
            sameClassCount[k]++;
          }
        }
      }
    }

    int max = 0;
    int maxIdx = 0;
    for(int i =0;i<n;i++){
      if(sameClassCount[i]>max) {
        max = sameClassCount[i];
        maxIdx = i;
      }
    }
    sb.append(maxIdx+1);
    bw.write(sb.toString());
    bw.flush();
  }
}
