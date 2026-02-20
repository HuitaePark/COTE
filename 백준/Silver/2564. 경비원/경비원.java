import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    StringTokenizer st = new StringTokenizer(br.readLine());
    int x = Integer.parseInt(st.nextToken());
    int y = Integer.parseInt(st.nextToken());
    int n = Integer.parseInt(br.readLine());
    int dul = (x+y) * 2;
    int sum = 0;
    int[][] arr = new int[n][2];
    for(int i=0;i<n;i++){
      st = new StringTokenizer(br.readLine());
      int dir = Integer.parseInt(st.nextToken());
      int len = Integer.parseInt(st.nextToken());
      arr[i][0] = dir;
      arr[i][1] = len;
    }
    st = new StringTokenizer(br.readLine());
    int currentDir = Integer.parseInt(st.nextToken());
    int currentLen = Integer.parseInt(st.nextToken());
    for(int i=0;i<n;i++){
      int dir = arr[i][0];
      int len = arr[i][1];
      switch(dir){
        case 1:
          if(currentDir==1){
            sum+=Math.abs(currentLen-len);
          }
          else if(currentDir==2){
            sum+=Math.min(len+y+currentLen,(x-len)+y+(x-currentLen));
          }
          else if(currentDir==3){
            sum+=(len+currentLen);
          }
          else{
            sum+=(x-len+currentLen);
          }
          break;
        case 2:
          if(currentDir==1){
            sum+=Math.min(len+y+currentLen,(x-len)+y+(x-currentLen));
          }
          else if(currentDir==2){
            sum+=Math.abs(currentLen-len);
          }
          else if(currentDir==3){
            sum+=(y-len+currentLen);
          }
          else{
            sum+=(y-len+x-currentLen);
          }
          break;
        case 3:
          if(currentDir==1){
            sum+=(len+currentLen);
          }
          else if(currentDir==2){
            sum+=(y-len+currentLen);
          }
          else if(currentDir==3){
            sum+=Math.abs(currentLen-len);
          }
          else{
            sum+=Math.min(len+x+currentLen,(y-len)+x+(y-currentLen));
          }
          break;
        case 4:
          if(currentDir==1){
            sum+=(x-len+currentLen);
          }
          else if(currentDir==2){
            sum+=(y-len+x-currentLen);
          }
          else if(currentDir==3){
            sum+=Math.min(len+x+currentLen,(y-len)+x+(y-currentLen));
          }
          else{
            sum+=Math.abs(currentLen-len);
          }
          break;
      }
    }
    sb.append(sum);
    bw.write(sb.toString());
    bw.flush();
  }
}
