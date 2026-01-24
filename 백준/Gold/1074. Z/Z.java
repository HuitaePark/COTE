import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    StringTokenizer st= new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    int r = Integer.parseInt(st.nextToken());
    int c = Integer.parseInt(st.nextToken());
    sb.append(func(n,r,c));
    bw.write(sb.toString());
    bw.flush();
  }
  static int func(int n, int r, int c){
    if(n==0) return 0;
    int half = 1 << (n-1);            
    int block = half * half;         

    if(r < half && c < half) return func(n-1, r, c);              
    if(r < half && c >= half) return block + func(n-1, r, c-half);   
    if(r >= half && c < half) return 2*block + func(n-1, r-half, c);
    return 3*block + func(n-1, r-half, c-half);                      
}
}
