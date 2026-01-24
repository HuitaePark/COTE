import java.util.*;
import java.io.*;
  
public class Main{
  static int a,b,c;
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    StringTokenizer st = new StringTokenizer(br.readLine());
    a  =Integer.parseInt(st.nextToken());
    b = Integer.parseInt(st.nextToken());
    c = Integer.parseInt(st.nextToken());

    sb.append(pow(a,b,c));
    bw.write(sb.toString());
    bw.flush();
  }
  static long pow(int a,int b, int m){
    if(b==1) return a%m;
    long val = pow(a,b/2,m);
    val = val * val % m;
    if(b%2 ==0) return val;
      return val * a % m;
  };
}
