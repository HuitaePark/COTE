import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    int k = Integer.parseInt(st.nextToken());
    StringBuilder ph = new StringBuilder(br.readLine());
    
    int count = 0;
    for(int i=0;i<ph.length();i++){
      if(ph.charAt(i)=='P'){
        for(int j = i-k;j<=i+k;j++){//앞을 탐색
          if(j<0 || j>=ph.length()) continue;
          if(ph.charAt(j)=='H'){
            count++;
            ph.setCharAt(j,' ');
            break;
          }
        }
      }
    }
    
    sb.append(count);      
    bw.write(sb.toString());
    bw.flush();
    br.close();
    bw.close();
  }
}
