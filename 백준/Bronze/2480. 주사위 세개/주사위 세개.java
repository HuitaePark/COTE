import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();

    int[] arr = new int[7];
    
    StringTokenizer st = new StringTokenizer(br.readLine());
    for(int i =0;i<3;i++){
      arr[Integer.parseInt(st.nextToken())]++;
    }
    

    int max = 0;
    
    for(int i = 1; i <=6;i++){
      if(arr[i]==3){
        int sum = 10000 + i *1000;
        sb.append(sum);
      }
      else if(arr[i]==2){
        int sum = 1000+i*100;
        sb.append(sum);
      }
    }

    for(int i = 1;i<=6;i++){
      if(arr[i]==1 && max<i){
        max = i;
      }
    }

    if (sb.length() == 0) {
      sb.append(max*100);
    }  

    bw.write(sb.toString());
    bw.flush();
  
  }
}
