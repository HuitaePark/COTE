import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    int n = Integer.parseInt(br.readLine());
    int[][] arr = new int[n][2];
    for(int i=0;i<n;i++){
      StringTokenizer st = new StringTokenizer(br.readLine());
      arr[i][0] = Integer.parseInt(st.nextToken());
      arr[i][1] = Integer.parseInt(st.nextToken()); 
    }
    for(int i=0;i<n;i++){
      int[] spec = arr[i];
      int count = 0;
      for(int j=0;j<n;j++){
        if(i==j) continue;
        if(arr[j][0]>spec[0] && arr[j][1]>spec[1]) count++;
      }
      sb.append(count+1).append(" ");
    }

    bw.write(sb.toString());
    bw.flush();
  }
}
