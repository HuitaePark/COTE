import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    int[] arr = new int[10];
    int a = Integer.parseInt(br.readLine());
    int b = Integer.parseInt(br.readLine());
    int c = Integer.parseInt(br.readLine());
    
    String answer = Integer.toString(a*b*c);
    for(int i =0;i<answer.length();i++){
      arr[answer.charAt(i)-'0']++;  
    }
    
    for(int i : arr){
      sb.append(i).append("\n");
    }

    bw.write(sb.toString());
    bw.flush();
  
  }
}
