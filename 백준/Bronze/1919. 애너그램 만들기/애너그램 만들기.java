import java.util.*;
import java.io.*;

public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    String str1 = br.readLine();
    String str2 = br.readLine();
    int[] arr = new int[26];
    for(int i = 0;i<str1.length();i++){
      arr[str1.charAt(i)-'a']++;
    }
    for(int i = 0;i<str2.length();i++){
      arr[str2.charAt(i)-'a']--;
    }
    int count = 0;
    for(int i : arr){
       if(i != 0){
        if(i > 0)
          count+=i;
         else
          count+=Math.abs(i); 
       }
    }
    bw.write(Integer.toString(count));
    bw.flush();
  }
}
