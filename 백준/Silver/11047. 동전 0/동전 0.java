import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    StringTokenizer st = new StringTokenizer(br.readLine());  
    
    int n = Integer.parseInt(st.nextToken());
    int price = Integer.parseInt(st.nextToken());
    
    Integer[] arr= new Integer[n];
    for(int i = 0;i<n;i++){
      arr[i]= Integer.parseInt(br.readLine());
    }


    Arrays.sort(arr,Collections.reverseOrder());
    
    int count = 0;
    for(Integer i : arr){
      if(i>price) continue;
      else{
        count+= price/i;
        price%=i;
      }
    }

    sb.append(count);




     bw.write(sb.toString());
     bw.flush();
  
  }
}
