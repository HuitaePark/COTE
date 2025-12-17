import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    int[] arr = new int[9];
    int sum = 0;
    for(int i =0;i<9;i++){
      arr[i] = Integer.parseInt(br.readLine());
      sum+=arr[i];
    }
    
    Arrays.sort(arr);
    
    int spy1 = 0;
    int spy2 = 0;
    
    for(int i = 0;i<9;i++){
      int current = sum - arr[i];
      
      for(int j = 0;j<9;j++){
        if(i==j) continue;
        if(current - arr[j] == 100){
          spy1 = i;
          spy2 = j;
        }      
      }
    }

    for(int i = 0;i<9;i++){
      if(i == spy1 || i== spy2) continue;
      sb.append(arr[i]).append("\n");
    }
    
    bw.write(sb.toString());
    bw.flush();
  
  }
}
