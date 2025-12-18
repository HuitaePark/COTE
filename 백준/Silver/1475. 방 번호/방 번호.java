import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    int[] arr = new int[10];
    String s = br.readLine();

    for(int i = 0;i<s.length();i++){
      if(s.charAt(i)=='6' && arr['9'-'0']<arr['6'-'0']){
        arr['9'-'0']++;
      }
      else if(s.charAt(i)=='9' && arr['6'-'0']<arr['9'-'0']){
        arr['6'-'0']++;
      }
      else{
        arr[s.charAt(i)-'0']++;
      }
    }
    int max = 0;
    for(int i : arr){
      if(max<i) max = i;
    }
    sb.append(max);
    bw.write(sb.toString());
    bw.flush();
  
  }
}
