import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    
    while(true){
      int n = Integer.parseInt(br.readLine());
      int cnt = 0;
      if(n==0){
        break;
      }
      for(int i = n+1;i<=2*n;i++){
        if(isPrime(i)){
          cnt++;
        }
      }
      sb.append(cnt).append("\n");
    }
  




     bw.write(sb.toString());
     bw.flush();
  
  }
  private static boolean isPrime(int num){
    if(num<=1) return false;
    if(num ==2 || num == 3) return true;
    if(num %2 ==0 || num % 3==0) return false;
    for(int i =5;i*i<=num;i+=6){
      if(num %i ==0 || num%(i+2)==0) {
        return false;
      }
    }
    return true;
  }
}
