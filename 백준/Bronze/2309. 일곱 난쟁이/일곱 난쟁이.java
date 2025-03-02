import java.util.*;
import java.io.*;

public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int[] arr = new int[9];
    
    for(int i = 0;i<9;i++){
      arr[i] = Integer.parseInt(br.readLine());
    }
    Arrays.sort(arr);
    int sum = 0;
    for(int i : arr){
      sum+=i;
    }
    int spy1 = 0;
    int spy2 = 0;
      for(int i = 0;i<9;i++){
        for(int j = i+1;j<9;j++){
          if(sum - (arr[i]+arr[j]) == 100){
            spy1 = arr[i];
            spy2 = arr[j];
          }
      }
    }
    for(int i = 0;i<9;i++){
        if(arr[i] != spy1 && arr[i] != spy2)
          bw.write(Integer.toString(arr[i])+"\n");
    }
    bw.flush();
  }
}
