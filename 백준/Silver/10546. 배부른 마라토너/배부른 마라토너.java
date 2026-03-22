import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    int n = Integer.parseInt(br.readLine());
    Map<String,Integer> map = new HashMap<>();
    for(int i=0;i<n;i++){
      String current = br.readLine();
      map.put(current,map.getOrDefault(current,0)+1);
    }

    for(int i=0;i<n-1;i++){
      String current = br.readLine();
      map.put(current,map.get(current)-1);
    }

    for(String s : map.keySet()){
      if(map.get(s)!=0)sb.append(s);
    }
    
    bw.write(sb.toString());
    bw.flush();
    br.close();
    bw.close();
  }
}
