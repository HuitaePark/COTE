import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    Map<String,Integer> map = new TreeMap<>();
    int n = Integer.parseInt(br.readLine());

    for(int i=0;i<n;i++){
      String s = br.readLine();
      String[] str = s.split("\\.");
      map.put(str[1],map.getOrDefault(str[1],0)+1);
    }

    for(String s : map.keySet()){
      sb.append(s).append(" ").append(map.get(s)).append("\n");
    }
    
    bw.write(sb.toString());
    bw.flush();
  }
}
