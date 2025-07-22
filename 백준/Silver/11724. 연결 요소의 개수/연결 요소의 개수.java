import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    Map<Integer,List<Integer>> map = new HashMap<>();
    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());
    Set<Integer> set = new HashSet<>();
    
    for(int i =1;i<=1000;i++){
      map.put(i,new ArrayList<>());
    }
    //인접리스트 초기화
    for(int i =0;i<m;i++){
      st = new StringTokenizer(br.readLine());
      int a = Integer.parseInt(st.nextToken());
      int b = Integer.parseInt(st.nextToken());
      map.get(a).add(b);
      map.get(b).add(a);
      set.add(a);
      set.add(b);
    }

    Set<Integer> visited = new HashSet<>();
    Queue<Integer> q = new LinkedList<>();
    int count = 0;

    for(int i = 1; i <= n; i++){
      
      if(!visited.contains(i)){
        count++;
        q.add(i);
        visited.add(i);

        while(!q.isEmpty()){
                int current = q.poll();
                for(Integer neighbor : map.get(current)){ 
                    if (!visited.contains(neighbor)) {
                        visited.add(neighbor);
                        q.add(neighbor);
                    }
                }
            }
      }
    }
  
    sb.append(count);


    bw.write(sb.toString());
    bw.flush();
  
  }
}
