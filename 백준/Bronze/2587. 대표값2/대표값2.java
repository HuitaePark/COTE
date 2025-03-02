import java.util.*;
import java.io.*;

public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int[] arr = new int[5];
    int sum = 0;
    for(int i = 0;i<5;i++){
      arr[i] = Integer.parseInt(br.readLine());
      sum += arr[i];
    }
    Arrays.sort(arr);
    bw.write(Integer.toString(sum/5)+"\n"+Integer.toString(arr[2]));
    bw.flush();
  }
}
