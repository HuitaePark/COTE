import java.util.*;
import java.io.*;
import java.util.stream.Collectors;

public class Main{
  
  static int n;
  static String[] arr;
  static boolean[][] visited;
  static Map<Integer,Integer> map;
  static int count = 0;
  
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    n = Integer.parseInt(br.readLine());
    map = new HashMap<>();
    visited = new boolean[n][n];
    arr = new String[n];

    for(int i = 0;i<n;i++){
      arr[i] = br.readLine();
    }
    for(int i = 0;i<n;i++){
      for(int j = 0;j<n;j++){
        if(arr[i].charAt(j)=='1'&&!visited[i][j]){
          count++;
          map.put(count,0);
          dfs(i,j,count);
        }
      }
    }
    
    
    sb.append(map.size()).append("\n");
    List<Integer> answer = map.values().stream()
    .sorted()
    .collect(Collectors.toList());


    for(Integer i : answer){
      sb.append(i).append("\n");
    }
    
    bw.write(sb.toString());
    bw.flush();
  
  }
  private static void dfs(int x,int y,int count){
    //종료조건
    if(x<0||x>=n||y<0||y>=n||arr[x].charAt(y)=='0'||visited[x][y] == true){
      return;
    }

    visited[x][y] = true;
    map.put(count,map.getOrDefault(count,0)+1);
    dfs(x + 1, y,count);
    dfs(x - 1, y,count);
    dfs(x, y + 1,count);
    dfs(x, y - 1,count);
    
  }
}
