import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    Map<String,Integer> map = new TreeMap<>();

    String line;
    int total = 0;
    while((line=br.readLine())!=null){
      map.put(line,map.getOrDefault(line,0)+1);
      total++;
    }
    for(Map.Entry<String,Integer> entry : map.entrySet()){
      sb.append(entry.getKey()).append(" ");
      sb.append(String.format("%.4f",(double)entry.getValue()/total*100)).append("\n");
    }
    
    bw.write(sb.toString());
    bw.flush();
  }
}
