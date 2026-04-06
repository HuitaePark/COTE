import java.util.*;
import java.io.*;
import java.math.*;  

public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 

    String s = br.readLine();
    BigInteger b = new BigInteger(s, 2);
    b = b.multiply(BigInteger.valueOf(17)); 
    
    bw.write(b.toString(2));
    bw.flush();
    br.close();
    bw.close();
  }
}