import java.util.*;
import java.io.*;
import java.math.*;

public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    int t = Integer.parseInt(br.readLine());
    for(int i=0;i<t;i++){
      StringTokenizer st = new StringTokenizer(br.readLine());
      int n = Integer.parseInt(st.nextToken());
      BigInteger[] arr = new BigInteger[n];
      for(int j=0;j<n;j++){
        arr[j] = new BigInteger(st.nextToken());
      }
      BigInteger sum = BigInteger.ZERO;
      for(int j=0;j<arr.length;j++){
        for(int k=j+1;k<arr.length;k++){
          sum = sum.add(arr[j].gcd(arr[k]));
        }
      }
      sb.append(sum.toString()).append("\n");
    }
    
    bw.write(sb.toString());
    bw.flush();
    br.close();
    bw.close();
  }
}
