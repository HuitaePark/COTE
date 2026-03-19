import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    int n = Integer.parseInt(br.readLine());
    int count  =Integer.parseInt(br.readLine());
    int[] arr = new int[count];
    
    StringTokenizer st = new StringTokenizer(br.readLine());
    for(int i=0;i<count;i++){
      arr[i] = Integer.parseInt(st.nextToken());
    }

    Map<Integer,Integer> map = new HashMap<>();
    List<Integer> recommand = new ArrayList<>();
    for(int i=0;i<count;i++){
      int current = arr[i];
      map.put(current,map.getOrDefault(current,0)+1);
      
      if(!recommand.contains(current)){
        if(recommand.size()==n){
          int min = Integer.MAX_VALUE;
        for(int j=0;j<recommand.size();j++){
          if(map.get(recommand.get(j))<min) min = map.get(recommand.get(j));
        }
        for(int j=0;j<recommand.size();j++){
          if(map.get(recommand.get(j))==min){
            map.put(recommand.get(j),0);
            recommand.remove(j);
            break;
            }
          }
        }
        recommand.add(current);
      }
    }
    
    Collections.sort(recommand);
    for(int i : recommand){
      sb.append(i).append(" ");
    }
    
    bw.write(sb.toString());
    bw.flush();
  }
}
