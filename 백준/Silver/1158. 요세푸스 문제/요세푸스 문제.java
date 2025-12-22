import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    int k = Integer.parseInt(st.nextToken());
    LinkedList<Integer> list = new LinkedList<>();
    int index = 0;
    for(int i = 1;i<=n;i++){
      list.add(i);
    }
    //1 2 3 4 5 6 7
    
    sb.append("<");
    List<String> strList = new ArrayList<>();
    
    while(!list.isEmpty()){
      int current = (index+k-1)%list.size();
      strList.add(Integer.toString(list.get(current))); 
      list.remove(current);
      index = current;
    }
    
    sb.append(String.join(", ",strList));
    sb.append(">");
    bw.write(sb.toString());
    bw.flush();
  
  }
}
