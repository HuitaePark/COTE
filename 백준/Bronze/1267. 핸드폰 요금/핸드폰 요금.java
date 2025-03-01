import java.util.*;
import java.io.*;

public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int n = Integer.parseInt(br.readLine());
    int[] arr = new int[n];
    StringTokenizer st = new StringTokenizer(br.readLine());
    for(int i=0;i<n;i++){
      arr[i] = Integer.parseInt(st.nextToken());
    }
    int Y = 0;
    int M = 0;
    
    for(int i : arr){
        Y += (i/30+1)*10;
        M += (i/60+1)*15;
      }
     if(Y==M){
       bw.write("Y M "+Integer.toString(M));
     }
     else if(Y>M){
       bw.write("M "+Integer.toString(M));
     }
     else{
       bw.write("Y "+Integer.toString(Y));
     }
    
    bw.flush();
  }
}
