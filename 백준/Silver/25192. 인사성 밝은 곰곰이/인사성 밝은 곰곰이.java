import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    int n = Integer.parseInt(br.readLine());
    int count = 0;
    Set<String> set = new HashSet<>();
    for(int i = 0;i<n;i++){
      String str = br.readLine();
      if(str.equals("ENTER")) set.clear();
      else if(!set.contains(str)){
        set.add(str);
        count++;
      }
    }
    sb.append(count);




     bw.write(sb.toString());
     bw.flush();
  
  }
}
