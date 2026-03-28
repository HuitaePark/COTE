import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    List<String> list = new ArrayList<>();
    int n = Integer.parseInt(br.readLine());
    Set<String> set = new HashSet<>();
    for(int i=0;i<n;i++){
      set.add(br.readLine());
    }
    for(String s : set){
      list.add(s);
    }
    Collections.sort(list,(a,b)->{
      if(a.length()!=b.length()) return a.length()-b.length();
      return a.compareTo(b);
    });
    
    for(int i=0;i<list.size();i++){
      sb.append(list.get(i)).append("\n");
    }
    bw.write(sb.toString());
    bw.flush();
    br.close();
    bw.close();
  }
}
