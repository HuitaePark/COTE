import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    int[] arr = new int[26];
    String s = br.readLine();
    Arrays.fill(arr,-1);
    
    for(int i = 0;i<s.length();i++){
      if(arr[s.charAt(i)-'a']==-1) arr[s.charAt(i)-'a'] = i;
    }
    for(int i = 0;i<arr.length;i++){
       sb.append(arr[i]).append(" ");
    }
    bw.write(sb.toString());
    bw.flush();
  
  }
}
