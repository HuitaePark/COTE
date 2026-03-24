import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    int t = Integer.parseInt(br.readLine());
    
    
    for(int k=0;k<t;k++){
      int n = Integer.parseInt(br.readLine());
      Set<Integer> set = new HashSet<>();
      StringTokenizer st = new StringTokenizer(br.readLine());
      for(int i=0;i<n;i++){
        set.add(Integer.parseInt(st.nextToken()));
      }
  
      int m = Integer.parseInt(br.readLine());
      st = new StringTokenizer(br.readLine());
      for(int i=0;i<m;i++){
        if(set.contains(Integer.parseInt(st.nextToken()))) sb.append(1).append("\n");
        else sb.append(0).append("\n");
      }
    }
        
    bw.write(sb.toString());
    bw.flush();
    br.close();
    bw.close();
  }
}
