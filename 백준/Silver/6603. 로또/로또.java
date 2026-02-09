import java.util.*;
import java.io.*;
  
public class Main{
  static StringBuilder sb = new StringBuilder();
  static int n;
  static int[] temp;
  static boolean[] used;
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    
    while(true){
      String s = br.readLine();
      if(s.equals("0")) break;
      
      StringTokenizer st = new StringTokenizer(s);
      n = Integer.parseInt(st.nextToken());
      temp = new int[30];
      int[] arr = new int[n];
      used = new boolean[30];
      for(int i = 0;i<n;i++){
        arr[i] = Integer.parseInt(st.nextToken());
      }
      func(0,arr,0);
      sb.append("\n");
    }
    bw.write(sb.toString());
    bw.flush();
  }
  static void func(int k,int[] arr,int start){
    if(k==6){
      for(int i = 0;i<6;i++){
        sb.append(temp[i]).append(" ");
      }
      sb.append("\n");
      return;
    }
    for(int i=start;i<n;i++){
      if(used[i]) continue;
      temp[k] = arr[i];
      used[i] = true;
      func(k+1,arr,i+1);
      used[i] = false;       
    }
  }
}
