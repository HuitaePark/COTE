import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    int n = Integer.parseInt(br.readLine());
    List<Integer> list = new ArrayList<>();
    StringTokenizer st = new StringTokenizer(br.readLine());
    for(int i=0;i<n;i++){
      int current = Integer.parseInt(st.nextToken());
      list.add(current,i+1);
    }
    for(int i=list.size()-1;i>=0;i--){
      sb.append(list.get(i)).append(" ");
    }
    bw.write(sb.toString());
    bw.flush();
    br.close();
    bw.close();
  }
}
