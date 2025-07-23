import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());
    int b = Integer.parseInt(st.nextToken());

    int[][] ground = new int[n][m];
    int minHeight = 256;
    int maxHeight = 0;
    
    for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                ground[i][j] = Integer.parseInt(st.nextToken());
                if (ground[i][j] < minHeight) {
                    minHeight = ground[i][j];
                }
                if (ground[i][j] > maxHeight) {
                    maxHeight = ground[i][j];
                }
            }
        }
      
      int minTime = Integer.MAX_VALUE;
      int finalHeight = -1;
      for (int h = minHeight; h <= maxHeight; h++) {
            int time = 0;
            int inventory = b;

            for (int i = 0; i < n; i++) {
              for (int j = 0; j < m; j++) {
                if(ground[i][j]>h){
                  int diff = ground[i][j] - h;
                  time+=diff*2;
                  inventory+=diff;
                }
              }
            }
            boolean possible = true;
            for (int i = 0; i < n; i++) {
              for (int j = 0; j < m; j++) {
                if(ground[i][j]<h){
                  int diff = h-ground[i][j];

                  if(inventory >=diff){
                    time+=diff;
                    inventory -=diff;
                  }
                  else{
                    possible = false;
                    break;
                  }
                }
              }
            }
            if(possible){
              if(time <=minTime){
                minTime = time;
                finalHeight = h;
              }
            }
      
      }
    sb.append(minTime + " " + finalHeight);
    bw.write(sb.toString());
    bw.flush();
  
  }
}
