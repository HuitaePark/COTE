import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    int n = Integer.parseInt(br.readLine());
    Set<String> set = new HashSet<>();
    set.add("ChongChong");
    for(int i = 0;i<n;i++){
      String st = br.readLine();
      String[] arr = st.split(" ");
      if(set.contains(arr[0])){
        set.add(arr[1]);
      }
      else if(set.contains(arr[1])){
        set.add(arr[0]);
      }
    }
    sb.append(set.size());

     bw.write(sb.toString());
     bw.flush();
  
  }
}
