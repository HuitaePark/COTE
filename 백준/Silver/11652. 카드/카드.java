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

    
    int max = 0;
    for(Map.Entry<String,Integer> entry : map.entrySet()){
      if(entry.getValue()>max){
        max = entry.getValue();
        sb.setLength(0);
        sb.append(entry.getKey());
      }
      else if(entry.getValue()==max){
        String current = entry.getKey();
        String maxcurrent = sb.toString();
        long min = Math.min(Long.parseLong(current),Long.parseLong(maxcurrent));
        sb.setLength(0);
        sb.append(min);
      }
    }
    
    bw.write(sb.toString());
    bw.flush();
    br.close();
    bw.close();
  }
}
