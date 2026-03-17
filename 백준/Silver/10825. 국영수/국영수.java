import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    Map<String,int[]> map = new HashMap<>();
    int n = Integer.parseInt(br.readLine());
    for(int i=0;i<n;i++){
      StringTokenizer st = new StringTokenizer(br.readLine());
      String s = st.nextToken();
      map.put(s,new int[3]);
      for(int j=0;j<3;j++){
        map.get(s)[j] = Integer.parseInt(st.nextToken());
      }
    }

    Set<String> str = map.keySet();
    List<String> list = new ArrayList<>();
    for(String s : str){
      list.add(s);
    }    

    Collections.sort(list,(a,b)->{
      if(map.get(a)[0]!=map.get(b)[0]) return map.get(b)[0] - map.get(a)[0];
      else if(map.get(a)[1]!=map.get(b)[1]) return map.get(a)[1] - map.get(b)[1];
      else if(map.get(a)[2]!=map.get(b)[2]) return map.get(b)[2] - map.get(a)[2];
      return a.compareTo(b);
    });

    for(String s : list){
      sb.append(s).append("\n");
    }
        
    bw.write(sb.toString());
    bw.flush();
  }
}
