import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    StringTokenizer st;
    int[] arr = new int[21];

    for(int i = 1;i<=20;i++){
      arr[i]= i;
    }

    for(int i =0;i<10;i++){
      st = new StringTokenizer(br.readLine());
      int start = Integer.parseInt(st.nextToken());
      int end = Integer.parseInt(st.nextToken());

      while(start<end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        start++;
        end--;
      }
    }
    
    for(int i : arr){
      if(i == 0) continue;
      sb.append(i).append(" ");
    }

    bw.write(sb.toString());
    bw.flush();
  
  }
}
