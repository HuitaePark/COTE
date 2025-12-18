import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    int n = Integer.parseInt(br.readLine());
    StringTokenizer st = new StringTokenizer(br.readLine());
    int[] arr = new int[n];
    for(int i = 0;i<n;i++){
      arr[i] = Integer.parseInt(st.nextToken());
    }
    int x = Integer.parseInt(br.readLine());

    boolean[] answer = new boolean[2000001];
    int count = 0;
    for(int i = 0;i<n;i++){
      if(arr[i]<x && answer[x-arr[i]]) count++;
      answer[arr[i]] = true;
    }
    
    sb.append(count);
    bw.write(sb.toString());
    bw.flush();
  
  }
}
