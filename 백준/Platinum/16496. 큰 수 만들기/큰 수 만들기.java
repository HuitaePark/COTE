import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    int n = Integer.parseInt(br.readLine());
    List<String> list = new ArrayList<>();

    StringTokenizer st = new StringTokenizer(br.readLine());
    for(int i=0;i<n;i++){
      list.add(st.nextToken());
    }

    Collections.sort(list,(a,b)->(b+a).compareTo(a+b));

    for(String s : list){
      sb.append(s);
    }

    if(sb.charAt(0) == '0'){
      System.out.println(0);
      return;
    }
    
    bw.write(sb.toString());
    bw.flush();
    br.close();
    bw.close();
  }
}
