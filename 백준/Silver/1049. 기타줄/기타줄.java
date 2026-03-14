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
    int[] set = new int[m];
    int[] one = new int[m];
    for(int i=0;i<m;i++){
      st = new StringTokenizer(br.readLine());
      set[i] = Integer.parseInt(st.nextToken());
      one[i] = Integer.parseInt(st.nextToken());
    }
    Arrays.sort(set);
    Arrays.sort(one);
    int allSet = (n/6+1)*set[0];
    int semiSet = (n/6)*set[0] + (n%6)*one[0];
    int allOne = n*one[0];

    sb.append(Math.min(allOne,Math.min(allSet,semiSet)));
    
    bw.write(sb.toString());
    bw.flush();
  }
}
