import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    
    int n = Integer.parseInt(br.readLine());
    
    
    for(int i = 0;i<n;i++){
      Queue<int[]> q = new LinkedList<>();
      StringTokenizer st= new StringTokenizer(br.readLine());
      int N = Integer.parseInt(st.nextToken());
      int M = Integer.parseInt(st.nextToken());
      
      //큐에 추가 arr[0]은 위치 arr[1]은 중요도
      st= new StringTokenizer(br.readLine());
      for(int j = 0;j<N;j++){
        q.add(new int[]{j,Integer.parseInt(st.nextToken())});
      }
      
      //꺼내고 버릴때마다 count++
      int count = 0;
      while(true){
        int[] arr = q.poll();
        int index = arr[0];
        int importance = arr[1];

        boolean priority  = false;
        for(int[] doc : q){
          if(doc[1]>importance){
             priority = true;
            break;
          }
        }
        
        if(priority){
          q.add(arr);
        }
        else{
            count++;
            if(index==M){
              sb.append(count).append("\n");
              break;
            }          
        
          }
        }

      }

      
    
     
    
     bw.write(sb.toString());
     bw.flush();
  
  }
}
