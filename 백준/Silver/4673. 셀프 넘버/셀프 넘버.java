import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    boolean[] visited = new boolean[10001];

    for(int i = 1;i<=10000;i++){
      int current = i;
      String s = Integer.toString(i);
      for(int j=0;j<s.length();j++){
        current+=Character.getNumericValue(s.charAt(j));
      }
      if(current>10000) continue;
      else visited[current] = true;
    }
    for(int i = 1;i<=10000;i++){
      if(!visited[i]) sb.append(i).append("\n");
    }

    bw.write(sb.toString());
    bw.flush();
    br.close();
    bw.close();
  }
}
