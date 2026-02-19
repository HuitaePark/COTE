import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    int n = Integer.parseInt(br.readLine());
    boolean[] arr = new boolean[n+1];
    StringTokenizer st = new StringTokenizer(br.readLine());
    for(int i=1;i<=n;i++){
      int current = Integer.parseInt(st.nextToken());
      if(current==1){
        arr[i] = true;
      }
      else arr[i] = false;
    }

    int m = Integer.parseInt(br.readLine());
    for(int i=0;i<m;i++){
      st = new StringTokenizer(br.readLine());
      int gender = Integer.parseInt(st.nextToken());
      int num = Integer.parseInt(st.nextToken());
      if(gender==1){
        int count = 1;
        while(num*count<=n){
          arr[num*count] = !arr[num*count];
          count++;
        }
      }
      else{
        int count = 1;
        while(num-count>0 && num+count<=n){
          if(arr[num+count]==arr[num-count]){
            count++;
          }
          else break;
        }
  
        for(int j=num-(count-1);j<=num+(count-1);j++){
           arr[j] = !arr[j];
         }
      }
    }
    for (int i = 1; i <= n; i++) {
    if (arr[i]) sb.append(1).append(" ");
    else sb.append(0).append(" ");
    if (i % 20 == 0) {
        sb.append("\n");
    }
}
    bw.write(sb.toString());
    bw.flush();
  }
}
