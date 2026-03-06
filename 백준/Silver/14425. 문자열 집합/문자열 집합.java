import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    Set<String> set = new HashSet<>();
    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());

    for(int i=0;i<n;i++){
      set.add(br.readLine());
    }

    int count = 0;
    for(int i=0;i<m;i++){
      if(set.contains(br.readLine())) count++;
    }

    sb.append(count);
    bw.write(sb.toString());
    bw.flush();
  
  }
}
