import java.util.*;
import java.io.*;
  
public class Main{
  private static int gcd(int x,int y){
    if(y==0) return x;
    return gcd(y,x%y);
  }
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    
    int n = Integer.parseInt(br.readLine());
    
    for(int i=0;i<n;i++){
       StringTokenizer st = new StringTokenizer(br.readLine());
       int a = Integer.parseInt(st.nextToken());
       int b = Integer.parseInt(st.nextToken());
       int gbd = (a*b)/gcd(a,b);
       sb.append(gbd+"\n");
    }



     bw.write(sb.toString());
     bw.flush();
  
  }
}
