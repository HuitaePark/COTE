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
    int[][] arr1 = new int[n][m];
    for(int i=0;i<n;i++){
      st = new StringTokenizer(br.readLine());
      for(int j=0;j<m;j++){
        arr1[i][j] = Integer.parseInt(st.nextToken());
      }
    }

    st = new StringTokenizer(br.readLine());
    n = Integer.parseInt(st.nextToken());
    m = Integer.parseInt(st.nextToken());
    int[][] arr2 = new int[n][m];
    for(int i=0;i<n;i++){
      st = new StringTokenizer(br.readLine());
      for(int j=0;j<m;j++){
        arr2[i][j] = Integer.parseInt(st.nextToken());
      }
    }

    int arr1r = arr1.length;
    int arr1c = arr1[0].length;
    int arr2r = arr2.length;
    int arr2c = arr2[0].length;
    int[][] answer = new int[arr1r][arr2c];

    for(int i=0;i<arr1r;i++){
      for(int j=0;j<arr2c;j++){
        for(int k=0;k<arr1c;k++){
          answer[i][j] += arr1[i][k] * arr2[k][j];
        }
      }
    }

    for(int i=0;i<answer.length;i++){
      for(int j=0;j<answer[0].length;j++){
        sb.append(answer[i][j]).append(" ");
      }  
      sb.append("\n");
    }
    
    bw.write(sb.toString());
    bw.flush();
  }
}
