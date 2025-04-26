import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    
    int n = Integer.parseInt(br.readLine());
    Set<String> set = new HashSet<>();
    
    for(int i=0;i<n;i++){
      StringTokenizer st = new StringTokenizer(br.readLine());
      String person = st.nextToken();
      String exit = st.nextToken();
      if(!set.isEmpty()&&exit.equals("leave")){
        set.remove(person);
      }
      else{
        set.add(person);
      }
    }
    
    String[] str = set.toArray(new String[0]);
    Arrays.sort(str,Collections.reverseOrder());
    for(String st : str){
      sb.append(st+"\n");
    }
    

     bw.write(sb.toString());
     bw.flush();
  
  }
}
