import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
      StringBuilder sb = new StringBuilder();
      int min = Integer.MAX_VALUE;
      StringTokenizer st = new StringTokenizer(br.readLine());
      int r = Integer.parseInt(st.nextToken());
      int c = Integer.parseInt(st.nextToken());
      char[][] arr = new char[r][c];
      for(int i=0;i<r;i++){
        String s = br.readLine();
        for(int j=0;j<c;j++){
          arr[i][j] = s.charAt(j);
        }
      }
      
      for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
          if(i+7>=r || j+7>=c) continue;
          int bCount=0;
          for(int k=i;k<i+8;k++){
            for(int l=j;l<j+8;l++){
              char expected = ((k+l)%2==0) ? 'B' : 'W';
              if(arr[k][l]!=expected) bCount++;
            }
          }
          int wCount = 64-bCount;
          
          min = Math.min(min, Math.min(bCount, wCount));
        }
      }
      
      sb.append(min);
      bw.write(sb.toString());
      bw.flush();
    }
}
