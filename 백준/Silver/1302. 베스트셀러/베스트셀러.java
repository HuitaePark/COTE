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
      map.put(s,map.getOrDefault(s,0)+1);
    }
    int max = Integer.MIN_VALUE;
    String name = "";
    for(String str : map.keySet()){
      if(map.get(str)>max){
        name = str;
        max = map.get(str);
      }
    }
    sb.append(name);
    bw.write(sb.toString());
    bw.flush();
  }
}
