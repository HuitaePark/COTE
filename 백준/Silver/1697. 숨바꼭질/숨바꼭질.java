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
    int[] arr = new int[100001];
    Arrays.fill(arr, -1);

    Queue<Integer> q = new ArrayDeque<>();

    q.offer(n);
    arr[n] = 0;

    while(!q.isEmpty()){
      int current = q.poll();
      if(m==current){
        sb.append(arr[current]);
        break;
      }
      int[] curArr = {current-1,current+1,current*2};
      for(int i : curArr){
        if(i<0 || i>100000) continue;
        if (arr[i] != -1) continue;
        arr[i] = arr[current] + 1;
        q.add(i);
      }
    }

    bw.write(sb.toString());
    bw.flush();
  }
}
