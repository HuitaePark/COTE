import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    int n = Integer.parseInt(br.readLine());
    for(int i = 0;i<n;i++){
      int m = Integer.parseInt(br.readLine());
      Set<String> set = new HashSet<>();
      Map<String,Integer> map = new HashMap<>();
      for(int j = 0;j<m;j++){
        String[] str = br.readLine().split(" ");
        set.add(str[1]);
        map.put(str[1],map.getOrDefault(str[1],0)+1);
      }

      int sum = 1;
      for(String st : set){
        sum*=(map.get(st)+1);
      }
      sb.append(sum-1).append("\n");
    }

    





     bw.write(sb.toString());
     bw.flush();
  
  }
}
