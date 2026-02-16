import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    String str = br.readLine().toLowerCase();
    int[] arr = new int[26];
    for(int i=0;i<str.length();i++){
      arr[str.charAt(i)-'a']++;
    }
    int max = Integer.MIN_VALUE;
    int idx = 0;
    for(int i=0;i<arr.length;i++){
      if(max<arr[i]) {
        idx = i;
        max = arr[i];
      }
    }
    boolean isDup = false;
    for(int i=0;i<arr.length;i++){
      if(i==idx) continue;
      if(max==arr[i]){
        isDup = true;
      }
    }
    if(isDup) sb.append("?");
    else sb.append((char)(idx+'a'));
    
    bw.write(sb.toString().toUpperCase());
    bw.flush();
  }
}
