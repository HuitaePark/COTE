import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    int n = Integer.parseInt(br.readLine());
    int[] arr = new int[n];

    for(int i=0;i<n;i++){
      arr[i] = Integer.parseInt(br.readLine());
    }

    int[] minus = new int[n-1];
    for(int i=1;i<n;i++){
      minus[i-1] = arr[i]-arr[i-1]; 
    }
    int gcd = minus[0];
    for(int i=1;i<minus.length;i++){
      gcd = gcd(minus[i],gcd);
    }
    
    int count = 0;
    for(int i=0;i<minus.length;i++){
      count += (minus[i] / gcd) - 1;
    }

    sb.append(count);
    bw.write(sb.toString());
    bw.flush();
    bw.close();
    br.close();
  }
  public static int gcd(int a,int b){
    if(b==0) return a;
    return gcd(b,a%b);
  }
}
