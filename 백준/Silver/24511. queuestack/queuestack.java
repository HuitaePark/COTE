import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    int n = Integer.parseInt(br.readLine());
    int[] A = new int[n];
    int[] B = new int[n];
    Queue<Integer> q = new LinkedList<>();
    
    StringTokenizer st = new StringTokenizer(br.readLine());
    StringTokenizer st2 = new StringTokenizer(br.readLine());
    for(int i = 0;i<n;i++){
      A[i] = Integer.parseInt(st.nextToken());
      B[i] = Integer.parseInt(st2.nextToken());
    }
    for(int i = n-1; i >= 0; i--){
      if(A[i]==0){
        q.add(B[i]);
      }
    }
    

    int m = Integer.parseInt(br.readLine());
    st = new StringTokenizer(br.readLine());
    for(int i = 0;i<m;i++){
      int value = Integer.parseInt(st.nextToken());
      q.add(value);
      sb.append(q.poll()).append(" ");
    }
    
  
     bw.write(sb.toString());
     bw.flush();
  
  }
}
