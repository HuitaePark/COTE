import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    int n = Integer.parseInt(br.readLine());
    int[][] arr = new int[n][2];
    
    for(int i=0;i<n;i++){
      StringTokenizer st = new StringTokenizer(br.readLine());
      arr[i][0] = Integer.parseInt(st.nextToken());
      arr[i][1] = Integer.parseInt(st.nextToken());
    }
    
    Arrays.sort(arr,(o1,o2)->{
      if(o1[0]==o2[0]){
        return Integer.compare(o1[1],o2[1]);
      }
      else return Integer.compare(o1[0],o2[0]);
    });
    
    for(int i=0;i<n;i++){
      sb.append(arr[i][0]+" "+arr[i][1]+"\n");
    }


     bw.write(sb.toString());
     bw.flush();
  
  }
}
