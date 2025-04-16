import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
  
    StringTokenizer st = new StringTokenizer(br.readLine());
    
    int a = Integer.parseInt(st.nextToken());
    int b = Integer.parseInt(st.nextToken());
    int c = Integer.parseInt(st.nextToken());

    int max = Math.max(a,Math.max(b,c));

    int[] arr = {a,b,c};
    Arrays.sort(arr);
    int sum = arr[0] + arr[1] + arr[2];
    if(arr[0]+arr[1] <= arr[2]){
      sum = (arr[0]+arr[1])*2-1;
    }
     sb.append(sum);
     bw.write(sb.toString());
     bw.flush();
  
  }
}
