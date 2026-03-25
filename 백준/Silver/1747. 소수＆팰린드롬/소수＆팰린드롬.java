import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    
    for(int i=n; ;i++){
      boolean prime = isPrime(i);
      if(!prime) continue;
      else{
        boolean isPelindrome = true;
        String current = Integer.toString(i);
        int start = 0;
        int end = current.length()-1;
        while(start<end){
          if(current.charAt(start)!=current.charAt(end)){
            isPelindrome = false; 
            break;
          }
          else{
            start++;
            end--;
          }
        }
        if(isPelindrome) {
          System.out.println(i);
          return;
        }
      }
    }
  }
  static boolean isPrime(int n){
      if(n==1) return false;
      if(n==2) return true;
      if(n==3) return true;
      if(n%2==0 || n%3==0) return false;
      for(int i=5;i*i<=n;i+=6){
        if(n%i==0 || n%(i+2)==0) return false;
      }
      return true;
  }
}
