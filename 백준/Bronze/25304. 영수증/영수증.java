import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    int money = Integer.parseInt(br.readLine());
    int n = Integer.parseInt(br.readLine());
    int sum = 0;
    for(int i=0;i<n;i++){
      StringTokenizer st = new StringTokenizer(br.readLine());
      sum+=(Integer.parseInt(st.nextToken())*Integer.parseInt(st.nextToken()));
    }
    if(sum==money) sb.append("Yes");
    else sb.append("No");
    bw.write(sb.toString());
    bw.flush();
    br.close();
    bw.close();
  }
}
