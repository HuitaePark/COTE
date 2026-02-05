import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    StringTokenizer st = new StringTokenizer(br.readLine());
    int start = Integer.parseInt(st.nextToken());
    int end = Integer.parseInt(st.nextToken());
    List<Integer> list = new ArrayList<>();
    for(int i =1;i<=1000;i++){
      for(int j = 0; j<i;j++){
        list.add(i);
      }
    }
    
    int sum = 0;
    for(int i = start;i<=end;i++){
      sum+=list.get(i-1);
    }
    sb.append(sum);
    bw.write(sb.toString());
    bw.flush();
  }
}
