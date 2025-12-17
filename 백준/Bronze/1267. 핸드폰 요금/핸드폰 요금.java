import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    int n = Integer.parseInt(br.readLine());
    int[] arr = new int[n];
    int y = 0;
    int m = 0;

    StringTokenizer st = new StringTokenizer(br.readLine());
    for(int i =0; i<n;i++){
      arr[i] = Integer.parseInt(st.nextToken());
    }

    for(int i = 0; i<n; i++){
      int current = arr[i];
      y+=(current/30)+1;
      m+=(current/60)+1;       
    }

    int ySum = y*10;
    int mSum = m*15;

    if(ySum==mSum){
      sb.append("Y ").append("M ").append(ySum);
    }
    else if(ySum<mSum){
      sb.append("Y ").append(ySum);
    }
    else{
      sb.append("M ").append(mSum);
    }

    bw.write(sb.toString());
    bw.flush();
  
  }
}
