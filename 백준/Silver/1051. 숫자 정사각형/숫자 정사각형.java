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
    int[][] arr = new int[n][m];
    int max = 1;
    for(int i=0;i<n;i++){
      String s = br.readLine(); 
      for(int j=0;j<m;j++){
        arr[i][j] = Character.getNumericValue(s.charAt(j));
      }
    }

    for(int i=0;i<n;i++){
      for(int j=0;j<m;j++){//2차원 배열을 모두 순회
        int current = arr[i][j];
        int rCount = 1;
        int cCount = 1;
        int temp_i = 0;
        int temp_j = 0;
        while(j+cCount<m){//같은 행에 같은 숫자를 탐색
          if(arr[i][j+cCount]==current) temp_j = cCount;
          cCount++;
        }
        while(i+rCount<n){ //같은 열에 같은 숫자를 탐색
          if(arr[i+rCount][j]==current) temp_i= rCount;
          rCount++;
        }
        int min = Math.min(temp_i,temp_j);
        for(int d = 1; d <= min; d++){
          if(current==arr[i+d][j+d] && current==arr[i][j+d] && current==arr[i+d][j]){
            max = Math.max(max,(d+1)*(d+1));
          }
        }
      }
    }    
    sb.append(max);
    bw.write(sb.toString());
    bw.flush();
  }
}
