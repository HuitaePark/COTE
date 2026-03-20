import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    int n = Integer.parseInt(br.readLine());
    List<Integer> crane = new ArrayList<>();
    StringTokenizer st = new StringTokenizer(br.readLine());
    for(int i=0;i<n;i++){
      crane.add(Integer.parseInt(st.nextToken()));
    }
    
    int count = Integer.parseInt(br.readLine());
    List<Integer> arr = new ArrayList<>();
    st = new StringTokenizer(br.readLine());
    for(int i=0;i<count;i++){
      arr.add(Integer.parseInt(st.nextToken()));
    }
    Collections.sort(arr,Collections.reverseOrder());
    Collections.sort(crane,Collections.reverseOrder());
    
    int time = 0;
    if(crane.get(0)<arr.get(0)){
        System.out.println(-1); 
        return; 
      }
    
    while(!arr.isEmpty()){
      for(int i=0;i<crane.size();i++){
        int current  = crane.get(i);
        if(!arr.isEmpty()){
          for(int j=0;j<arr.size();j++){
            if(current>=arr.get(j)){
              arr.remove(j);
              break;
            }
          }
        }
      }  
      time++;
    }
    
    sb.append(time);
    bw.write(sb.toString());
    bw.flush();
    br.close();
    bw.close();
  }
}
