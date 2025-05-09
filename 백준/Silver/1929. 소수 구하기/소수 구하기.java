import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());
    for(int i = n;i<=m;i++){
      if(isPrime(i)) sb.append(i).append("\n");
    }

     bw.write(sb.toString());
     bw.flush();
  
  }  
  private static boolean isPrime(int n){
    if(n<=1) return false;
    if (n == 2 || n == 3) return true;
    if(n%2 == 0 || n%3 == 0) return false;
    for(int i = 5;i*i<=n;i+=6){
      if(n%i==0 || n%(i+2)==0){
        return false;
      }
    } 
    return true;
  }
}
