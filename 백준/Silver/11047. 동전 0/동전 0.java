import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    StringTokenizer st = new StringTokenizer(br.readLine());  
    int n = Integer.parseInt(st.nextToken());
    int money = Integer.parseInt(st.nextToken());
    int[] arr = new int[n];
    for(int i=0;i<n;i++){
      arr[i] = Integer.parseInt(br.readLine());
    }

    int count = 0;
    for(int i=arr.length-1;i>=0;i--){
      if(arr[i]>money) continue;
      else if(arr[i]<=money){
        count += money/arr[i];
        money = money%arr[i];
      }
      if(money==0) break;
     }
    sb.append(count);
    bw.write(sb.toString());
    bw.flush();
  }
}
