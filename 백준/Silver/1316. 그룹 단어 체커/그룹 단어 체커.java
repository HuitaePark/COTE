import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    int n = Integer.parseInt(br.readLine());
    int count = 0;
    for(int i=0;i<n;i++){
      String s = br.readLine();
      Set<Character> set = new HashSet<>();
      int idx = s.length()-1;
      boolean isGroup = true;
      while(idx>=0){
        char current = s.charAt(idx);
        if(!set.contains(current)) set.add(current);
        else if(s.charAt(idx+1)==current){
          idx--;
          continue;
        }
        else{
          isGroup = false;
          break;
        }
        idx--;
      }
      if(isGroup) count++;
    }
    
    sb.append(count);
    bw.write(sb.toString());
    bw.flush();
  }
}
