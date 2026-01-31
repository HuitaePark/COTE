import java.util.*;
import java.io.*;
  
public class Main{

  static int count = 0;
  static int n;
  static boolean[] used1,used2,used3;
  
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    n = Integer.parseInt(br.readLine());
    used1 = new boolean[15];
    used2 = new boolean[40];
    used3 = new boolean[40];
    func(0);
    sb.append(count);
    bw.write(sb.toString());
    bw.flush();
  }
  static void func(int current){
    if(current == n){
      count++;
      return;
    }
    for(int i =0;i<n;i++){
      if(used1[i] || used2[i+current] || used3[current-i+n+1]) continue;

      used1[i] = true;
      used2[i+current] = true;
      used3[current-i+n+1] = true;
      func(current+1);
      used1[i] = false;
      used2[i+current] = false;
      used3[current-i+n+1] = false;
    }
  }
}
