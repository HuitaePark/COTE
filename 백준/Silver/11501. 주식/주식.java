import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    int n = Integer.parseInt(br.readLine());
    for(int i=0;i<n;i++){
      int t = Integer.parseInt(br.readLine());
      int[] arr =new int[t];
      
      StringTokenizer st = new StringTokenizer(br.readLine());
      for(int j=0;j<t;j++){
        arr[j] = Integer.parseInt(st.nextToken());
      }
      
      long money = 0;
      int max = arr[arr.length-1];
      for(int j=arr.length-2;j>=0;j--){
          if(arr[j]<max) money+=(long)(max-arr[j]);
          else max = arr[j];
      }
      sb.append(money).append("\n");
      }
    bw.write(sb.toString());
    bw.flush();
    }
  }


