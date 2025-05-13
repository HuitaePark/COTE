import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    int n = Integer.parseInt(br.readLine());
    int window = 0;
    //약수가 짝수개면 닫히고 홀수개면 열림
    for(int i = 1;i*i<=n;i++){
      window++;
    }
     sb.append(window);
     bw.write(sb.toString());
     bw.flush();
  
  }
}
