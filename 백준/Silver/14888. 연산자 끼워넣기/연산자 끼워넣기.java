import java.util.*;
import java.io.*;
  
public class Main{
    static int n;
    static int[] arr;
    static int[] giho = new int[4];
    static int MAX = Integer.MIN_VALUE; 
    static int MIN = Integer.MAX_VALUE; 
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    n = Integer.parseInt(br.readLine());
    arr = new int[n];
    StringTokenizer st = new StringTokenizer(br.readLine());
    for(int i=0;i<n;i++){
      arr[i] = Integer.parseInt(st.nextToken());
    }
    
    giho = new int[4];
    st = new StringTokenizer(br.readLine());
    for(int i=0;i<4;i++){
      giho[i] = Integer.parseInt(st.nextToken());
    }
    dfs(1, arr[0]);
    
    sb.append(MAX).append("\n").append(MIN);

    bw.write(sb.toString());
    bw.flush();
    br.close();
    bw.close();
  }
  public static void dfs(int index, int currentResult){
    if (index == n) {
            MAX = Math.max(MAX, currentResult);
            MIN = Math.min(MIN, currentResult);
            return;
        }  
    for (int i = 0; i < 4; i++) {
            if (giho[i] > 0) {
                giho[i]--;
                if (i == 0) dfs(index + 1, currentResult + arr[index]);
                else if (i == 1) dfs(index + 1, currentResult - arr[index]);
                else if (i == 2) dfs(index + 1, currentResult * arr[index]);
                else if (i == 3) dfs(index + 1, currentResult / arr[index]);
                giho[i]++;
      }
    }
  }
}
