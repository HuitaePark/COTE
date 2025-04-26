import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    
    int n = Integer.parseInt(br.readLine());
    Set<Integer> set = new HashSet<>();
    StringTokenizer st = new StringTokenizer(br.readLine());
    
    for(int i=0;i<n;i++){
       set.add(Integer.parseInt(st.nextToken()));
    }

    int m = Integer.parseInt(br.readLine());
    int[] arr = new int[m];
    st = new StringTokenizer(br.readLine());
    for(int i=0;i<m;i++){
      arr[i] = Integer.parseInt(st.nextToken());
    }
    for(int i : arr){
    if(set.contains(i)) sb.append("1 ");
      else sb.append("0 ");
     }
     bw.write(sb.toString());
     bw.flush();
  
  }
}
