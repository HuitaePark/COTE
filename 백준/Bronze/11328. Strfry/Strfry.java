import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    int n = Integer.parseInt(br.readLine());
    
    for(int i=0;i<n;i++){
      int[] arr = new int[26];
      StringTokenizer st = new StringTokenizer(br.readLine());
      String s = st.nextToken();
      for(int j=0;j<s.length();j++){
        arr[s.charAt(j)-'a']++;
      }

      String s2 = st.nextToken();
      for(int j=0;j<s2.length();j++){
        arr[s2.charAt(j)-'a']--;
      }

      boolean isStrfry = true;
      for(int j=0;j<arr.length;j++){
        if(arr[j]!=0){
          isStrfry = false;
          break;
        }
      }

      if(isStrfry) sb.append("Possible\n");
      else sb.append("Impossible\n");
    }

    bw.write(sb.toString());
    bw.flush();
  }
}
