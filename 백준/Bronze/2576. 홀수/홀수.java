import java.util.*;
import java.io.*;

public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int[] arr = new int[7];
    int sum = 0;
    int min = 0;
    for(int i = 0;i<7;i++){
      arr[i] = Integer.parseInt(br.readLine());
    }
    Arrays.sort(arr);
    min = arr[6];
    for(int i = 0;i<7;i++){
      if(arr[i]%2==1){
        sum += arr[i];
        if(arr[i]<min)
          min = arr[i];
      }
    }
    
    if(sum == 0){
      bw.write("-1");
    }
    else{
      bw.write(Integer.toString(sum)+"\n"+Integer.toString(min));
    }
    
    bw.flush();
  }
}

