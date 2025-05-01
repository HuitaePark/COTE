import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    StringTokenizer st = new StringTokenizer(br.readLine());
    long a = Long.parseLong(st.nextToken());
    long b = Long.parseLong(st.nextToken());

    long g = (a*b)/gcd(a,b);

    sb.append(g);



     bw.write(sb.toString());
     bw.flush();
  
  }
  public static long gcd(long a,long b){
    if(b==0) return a;
    return gcd(b,a%b);
  }
}
