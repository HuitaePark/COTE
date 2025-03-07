import java.util.*;
import java.io.*;

public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    String str = br.readLine();
    int[] arr = new int[26];
    
    for(int i = 0;i<str.length();i++){
      int n = str.charAt(i)-'a';
      arr[n]++;
     }
    for(int i : arr){
      bw.write(i + " ");
      }
    bw.flush();
  }
}
