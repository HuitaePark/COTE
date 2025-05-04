import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    StringTokenizer st= new StringTokenizer(br.readLine());
    int ja1 = Integer.parseInt(st.nextToken());
    int mo1 = Integer.parseInt(st.nextToken());
    st= new StringTokenizer(br.readLine());
    int ja2 = Integer.parseInt(st.nextToken());
    int mo2 = Integer.parseInt(st.nextToken());

    int mo = (mo1 * mo2) / gcd(mo1,mo2);
    int ja =  (mo/mo1*ja1) + (mo/mo2*ja2);
    sb.append(ja/gcd(mo,ja)).append(" ").append(mo/gcd(mo,ja));
    
     bw.write(sb.toString());
     bw.flush();
  
  }
  private static int gcd(int a,int b){
    if(b==0) return a;
    else return gcd(b,a%b);
  }
}
