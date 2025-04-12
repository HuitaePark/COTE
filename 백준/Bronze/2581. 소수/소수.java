import java.util.*;
import java.io.*;

public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringBuilder sb = new StringBuilder();
    
    int M = Integer.parseInt(br.readLine());
    int N = Integer.parseInt(br.readLine());
    int sum = 0 , min = N;
    
    for(int i =M;i<=N;i++){
       if(isPrime(i) && i<min){
         sum+=i;
         min = i;
       }
      else if(isPrime(i)){
        sum+=i;
      }  
    }
    
    if(sum == 0){
      sum = -1;
      sb.append(-1);
    }
    else{
      sb.append(sum).append("\n").append(min);
    }
    
    
    bw.write(sb.toString());
    bw.flush();
  }

  
  
  public static boolean isPrime(int n){
    if (n <= 1) return false;
    for (int j = 2; j * j <= n; j++) {
        if (n % j == 0) return false;
    }
    return true;
  }



}
