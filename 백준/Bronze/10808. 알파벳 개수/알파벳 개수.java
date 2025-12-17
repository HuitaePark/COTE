import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    String s = br.readLine();
    int[] arr = new int[26];
    
    for(int i = 0;i<s.length();i++){
      arr[s.charAt(i)-'a']++;
    }

    for(int i : arr){
      sb.append(i).append(" ");
    }

    bw.write(sb.toString());
    bw.flush();
  
  }
}
