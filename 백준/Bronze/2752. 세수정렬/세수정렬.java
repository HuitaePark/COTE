import java.util.*;
import java.io.*;

public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int[] arr = new int[3];
    StringTokenizer st  = new StringTokenizer(br.readLine());
    for(int i =0;i<3;i++){
      arr[i] = Integer.parseInt(st.nextToken());
    }
    Arrays.sort(arr);
    for(int i : arr){
      bw.write(Integer.toString(i)+" ");
    }

    
    bw.flush();
  }
}
