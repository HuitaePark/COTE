import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    
    int n = Integer.parseInt(br.readLine());
    List<Integer> list = new ArrayList<>();

    while(n>0){
      list.add(n%10);
      n/=10;
    }
    Collections.sort(list,Collections.reverseOrder());

    for(Integer j : list){
      sb.append(j);
    }
    
     bw.write(sb.toString());
     bw.flush();
  
  }
}
