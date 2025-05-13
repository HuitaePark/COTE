import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    int n = Integer.parseInt(br.readLine());
    for(int i=0;i<n;i++){
      int count = 0;
      int m = Integer.parseInt(br.readLine());
      for(int j = 1;j<=m/2;j++){
        if(isPrime(j)&&isPrime(m-j)){
          count++;
        }
      }
      sb.append(count+"\n");
    }





     bw.write(sb.toString());
     bw.flush();
  
  }
  private static boolean isPrime(int num){
    if(num<=1) return false;
    if(num == 2 || num == 3) return true;
    if(num % 2 == 0 || num % 3 == 0) return false;
    for(int i = 5;i*i<=num;i+=6){
      if(num%i == 0 || num % (i+2) == 0){
        return false;
      }
    }
    return true;
  }
}
