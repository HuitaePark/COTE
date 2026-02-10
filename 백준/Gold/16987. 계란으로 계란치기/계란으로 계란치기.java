import java.util.*;
import java.io.*;
  
public class Main{
  static int[][] egg; // 0은 내구도 1은 무게
  static int n;
  static int max = 0;
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    n = Integer.parseInt(br.readLine());
    egg = new int[n][2];
    for(int i = 0;i<n;i++){
      StringTokenizer st = new StringTokenizer(br.readLine());
      egg[i][0] = Integer.parseInt(st.nextToken());
      egg[i][1] = Integer.parseInt(st.nextToken());
    }
    func(0);
    sb.append(max);
    bw.write(sb.toString());
    bw.flush();
  }
  static void func(int idx){
    if(idx==n){
      int count = 0;
      for(int i=0;i<n;i++){
        if(egg[i][0]<=0) count++;
      }
      max = Math.max(max,count);
      return;
    }
    if(egg[idx][0]<0 || isAllBroken(idx)){
      func(idx+1);
      return;
    }
    for(int i=0;i<n;i++){
      if(i!=idx && egg[i][0]>0){
        egg[idx][0]-=egg[i][1];
        egg[i][0]-=egg[idx][1];
        func(idx+1);
        egg[idx][0]+=egg[i][1];
        egg[i][0]+=egg[idx][1];
      }
    }
  }
  static boolean isAllBroken(int idx){
    for(int i = 0;i<n;i++){
      if(i!=idx && egg[i][0]>0) return false;
    }
    return true;
  }
}
