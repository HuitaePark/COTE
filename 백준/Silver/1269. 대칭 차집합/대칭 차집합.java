import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    Set<Integer> A = new HashSet<>();
    Set<Integer> B = new HashSet<>();
    
    StringTokenizer st = new StringTokenizer(br.readLine());
    int a = Integer.parseInt(st.nextToken());
    int b = Integer.parseInt(st.nextToken());
    st = new StringTokenizer(br.readLine());
    for(int i=0;i<a;i++){
      A.add(Integer.parseInt(st.nextToken()));  
    }
    st = new StringTokenizer(br.readLine());
    for(int i=0;i<b;i++){
      B.add(Integer.parseInt(st.nextToken()));  
    }
    int Asize = A.size();
    int Bsize = B.size();
    for(int i : A){
      if(B.contains(i)){
        Asize--;
      }
    }
    for(int i : B){
      if(A.contains(i)){
        Bsize--;;
      }
    }
      
    
    
  
     sb.append(Asize+Bsize);
     bw.write(sb.toString());
     bw.flush();
    
  }
}
