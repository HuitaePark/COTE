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
    HashMap<String,String> map1 = new HashMap<>();
    HashMap<String,String> map2 = new HashMap<>();
    
    for(int i=1;i<=n;i++){
      String pokemon = br.readLine();
      map1.put(pokemon,Integer.toString(i));
      map2.put(Integer.toString(i),pokemon);
    }
    
    for(int i=0;i<m;i++){
      String answer = br.readLine();
      if(map1.containsKey(answer)){
        sb.append(map1.get(answer)+"\n");
      }
      else if(map2.containsKey(answer)){
        sb.append(map2.get(answer)+"\n");
      }
    }



     bw.write(sb.toString());
     bw.flush();
  
  }
}
