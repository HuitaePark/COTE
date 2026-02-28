import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    int n = Integer.parseInt(br.readLine());
    Set<String> set =new HashSet<>();
    for(int i=0;i<n;i++){
      String[] str = br.readLine().split(" ");
      if(str[1].equals("enter")) set.add(str[0]);
      else set.remove(str[0]);
    }
    List<String> list = new ArrayList<>();
    for(String s: set){
      list.add(s);
    }
    Collections.sort(list,Collections.reverseOrder());
    for(String s : list){
      sb.append(s).append("\n");
    }
    bw.write(sb.toString());
    bw.flush();
  }
}
