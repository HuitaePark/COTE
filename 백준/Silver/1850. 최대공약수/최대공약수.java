import java.util.*;
import java.io.*;
import java.math.*;

public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    StringTokenizer st = new StringTokenizer(br.readLine());
    BigInteger a = BigInteger.valueOf(Long.parseLong(st.nextToken()));
    BigInteger b = BigInteger.valueOf(Long.parseLong(st.nextToken()));
    int gcd = a.gcd(b).intValue();

    for(int i=0;i<gcd;i++){
      sb.append(1);
    }

    bw.write(sb.toString());
    bw.flush();
    br.close();
    bw.close();
  }
}
