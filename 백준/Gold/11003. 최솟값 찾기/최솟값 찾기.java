import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    int l = Integer.parseInt(st.nextToken());
    int[] arr = new int[n];
    int[] answer = new int[n];
    Deque<Integer> dq = new ArrayDeque<>();
    
    st = new StringTokenizer(br.readLine());
    for(int i =0;i<n;i++){
        arr[i] = Integer.parseInt(st.nextToken());
    }

    for(int i = 0;i<n;i++){
      if(!dq.isEmpty() && dq.peek()<i-l+1) dq.pollFirst();
      while(!dq.isEmpty() && arr[dq.peekLast()]>arr[i]) dq.pollLast();
      dq.offerLast(i);
      answer[i] = dq.peek();
    }

    for(int i : answer){
      sb.append(arr[i]).append(" ");
    }
    bw.write(sb.toString());
    bw.flush();
  
  }
  
}

