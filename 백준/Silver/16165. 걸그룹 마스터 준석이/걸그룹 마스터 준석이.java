import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());
    Map<String,List<String>> group = new HashMap<>();
    Map<String,String> member = new HashMap<>();
  
    for(int i=0;i<n;i++){
      String current = br.readLine();
      int count = Integer.parseInt(br.readLine());
      group.put(current,new ArrayList<>());
      for(int j=0;j<count;j++){
        String currentMember = br.readLine();
        group.get(current).add(currentMember);
        member.put(currentMember,current);
      }
    }

    for(int i=0;i<m;i++){
      String current = br.readLine();
      int quiz = Integer.parseInt(br.readLine());
      if(quiz==1){
          sb.append(member.get(current)).append("\n");
      }
      else{
        List<String> list = group.get(current);
        Collections.sort(list);
        for(String s : list){
          sb.append(s).append("\n");
        }
      }
    }

    bw.write(sb.toString());
    bw.flush();
  }
}
