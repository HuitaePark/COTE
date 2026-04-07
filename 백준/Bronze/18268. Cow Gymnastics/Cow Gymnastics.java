import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    StringTokenizer st = new StringTokenizer(br.readLine());
    int k = Integer.parseInt(st.nextToken());
    int n = Integer.parseInt(st.nextToken());
    Map<String,Integer> map = new HashMap<>();
    for(int i=0;i<k;i++){
      String[] s = br.readLine().split(" ");
      for(int j=0;j<n;j++){
        String current = s[j];
        for(int l = j+1;l<n;l++){
          String low = s[l];
          String rank = current+" "+low;
          map.put(rank,map.getOrDefault(rank,0)+1);
        }
      }
    }

    int count = 0;
    for(String s : map.keySet()){
      if(map.get(s)==k) count++;
    }

    sb.append(count);

    bw.write(sb.toString());
    bw.flush();
    br.close();
    bw.close();
  }
}
