import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    Map<Integer,Integer> map = new HashMap<>();
    for(int i = 0;i<9;i++){
      map.put(Integer.parseInt(br.readLine()),i);
    }
    int max = 0;
    for(Integer key : map.keySet()){
      if(key>max) max = key;
    }
    sb.append(max).append("\n").append(map.get(max)+1);
    bw.write(sb.toString());
    bw.flush();
  
  }
}
