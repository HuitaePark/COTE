import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    int n = Integer.parseInt(br.readLine());
    HashSet<Integer> set = new HashSet<>();
    StringTokenizer st = new StringTokenizer(br.readLine());
    for(int i = 0;i<n;i++){
      int b = Integer.parseInt(st.nextToken());
      set.add(b);
    }
    int m = Integer.parseInt(br.readLine());
    st = new StringTokenizer(br.readLine());
    for(int i = 0;i<m;i++){
     int card = Integer.parseInt(st.nextToken());
     if(set.contains(card)){
       sb.append(1).append("\n");
     }
      else{
        sb.append(0).append("\n");
      }
    }
    


     bw.write(sb.toString());
     bw.flush();
  
  }
}
