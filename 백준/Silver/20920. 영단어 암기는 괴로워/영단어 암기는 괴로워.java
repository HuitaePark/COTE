import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());
    Map<String,Integer> map = new HashMap<>();
    for(int i=0;i<n;i++){
      String s = br.readLine();
      if(s.length()>=m){
        map.put(s,map.getOrDefault(s,0)+1);
      }
    }
    List<String> list = new ArrayList<>();
    for(Map.Entry<String,Integer> entry : map.entrySet()){
      list.add(entry.getKey());
    }
    Collections.sort(list, (a, b) -> {
    int fa = map.get(a), fb = map.get(b);
    if (fa != fb) return fb - fa;              
    if (a.length() != b.length()) return b.length() - a.length(); 
    return a.compareTo(b);                       
});
    for(String s: list){
      sb.append(s).append("\n");
    }
    
    bw.write(sb.toString());
    bw.flush();
  
  }
}
