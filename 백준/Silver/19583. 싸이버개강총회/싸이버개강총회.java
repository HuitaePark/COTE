import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    StringTokenizer st = new StringTokenizer(br.readLine());
    
    int[] time = new int[3];
    for(int i=0;i<3;i++){
      String current = st.nextToken();
      String[] s = current.split("\\:");
      time[i] = Integer.parseInt(s[0])*60 + Integer.parseInt(s[1]);
    }

    Set<String> set = new HashSet<>();
    int count = 0;
    String readline;
    while((readline=br.readLine())!=null){
      st = new StringTokenizer(readline);
      String[] s = st.nextToken().split("\\:");
      int currentTime = Integer.parseInt(s[0])*60 + Integer.parseInt(s[1]);
      String student = st.nextToken();

      if(currentTime<=time[0]) set.add(student);
      else if(time[1]<=currentTime && currentTime<=time[2]){
        if(set.contains(student)){
          count++;
          set.remove(student);
        }
      }
    }

    sb.append(count);
    bw.write(sb.toString());
    bw.flush();
    br.close();
    bw.close();
  }
}
