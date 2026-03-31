import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    int n = Integer.parseInt(br.readLine());
    long[] arr = new long[50];
    arr[0] = 0L;
    arr[1] = 1L;
    arr[2] = 1L;
    for(int i=3;i<50;i++){
      arr[i] = arr[i-1]+arr[i-2];
    }
    sb.append(arr[n]);
    bw.write(sb.toString());
    bw.flush();
    br.close();
    bw.close();
  }
}
