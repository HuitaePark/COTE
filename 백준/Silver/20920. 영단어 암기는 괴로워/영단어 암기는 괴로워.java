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
    for(int i =0;i<n;i++){
      String str = br.readLine();
      if(str.length()>=m){
        map.put(str,map.getOrDefault(str,0)+1);
      }
    }
    List<Map.Entry<String, Integer>> entryList = new ArrayList<>(map.entrySet());
    Collections.sort(entryList,(o1,o2)->{
      if(o1.getValue()==o2.getValue() && o1.getKey().length()==o2.getKey().length()){
        return o1.getKey().compareTo(o2.getKey());
      }
      else if(o1.getValue()==o2.getValue()){
        return o2.getKey().length() - o1.getKey().length();
      }
      else{
        return o2.getValue() - o1.getValue();
      }
    });

    for(int i = 0;i<entryList.size();i++){
      sb.append(entryList.get(i).getKey()).append("\n");
    }
  

     bw.write(sb.toString());
     bw.flush();
  
  }
}
