import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    int n = Integer.parseInt(br.readLine());
    Set<String> set = new HashSet<>();
    for(int i=0;i<n;i++){
      set.add(br.readLine());
    }
    List<String> list = new ArrayList<>();
    for(String s : set){
      list.add(s);
    }
    
    int count = 0;
    for(int i=0;i<list.size();i++){
      String current = list.get(i);
      for(int j=0;j<list.size();j++){
        if(i==j) continue;
        if(list.get(j).startsWith(current)){
          count++;
          break;
        }
      }
    }
    sb.append(list.size()-count);
    bw.write(sb.toString());
    bw.flush();
  }
}

