import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());//듣도 못한사람
    int m = Integer.parseInt(st.nextToken());//보도 못한사람

    Set<String> dt = new HashSet<>();
    Set<String> bo = new HashSet<>(); 
    List<String> list = new ArrayList<>();
    
    for(int i=0;i<n;i++){
      dt.add(br.readLine());
    }
    for(int i=0;i<n;i++){
      bo.add(br.readLine());
    }
    if(m>n){
      for(String str : bo){
        if(dt.contains(str)){
          list.add(str);
        }
      }
    }
    else{
      for(String str : dt){
        if(bo.contains(str)){
          list.add(str);
        }
      }
    }
    
    Collections.sort(list);
    sb.append(list.size()+"\n");
    for(String str : list){
       sb.append(str+"\n");
    }


     bw.write(sb.toString());
     bw.flush();
  
  }
}
