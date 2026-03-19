import java.util.*;
import java.io.*;
import java.math.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    BigInteger[] arr = new BigInteger[501];
    arr[0] = BigInteger.ONE;
    int n = Integer.parseInt(br.readLine());

    for(int i=1;i<arr.length;i++){
      arr[i] = arr[i-1].multiply(BigInteger.valueOf(i+1));
    }
    
    if(n==0){
      bw.write("0");
      bw.flush();
    }
    else{
    String s = arr[n-1].toString();
    int idx = s.length()-1;
    int count = 0;
    for(int i = idx;i>=0;i--){
      if(s.charAt(i)=='0') count++;
      else break;
    }

    sb.append(count);
    bw.write(sb.toString());
    bw.flush();
    }
    br.close();
    bw.close();
  }
}
