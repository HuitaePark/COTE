import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    int n = Integer.parseInt(br.readLine());
    int maxW = 0, maxH = 0;
    int maxWIdx = -1, maxHIdx = -1;
    int[] len = new int[6];
    for(int i=0;i<6;i++){
      StringTokenizer st = new StringTokenizer(br.readLine());
      int dir = Integer.parseInt(st.nextToken());
      int length = Integer.parseInt(st.nextToken());

      len[i] = length;

      if(dir==1 || dir==2){
        if(length>maxW){
          maxW = length;
          maxWIdx = i;
        }
      }

      if(dir==3 || dir==4){
        if(length>maxH){
          maxH = length;
          maxHIdx = i;
        }
      }
    }
    int big = maxW * maxH;
    int smallW = len[(maxWIdx+3)%6];
    int smallH = len[(maxHIdx+3)%6];
    int small = smallW* smallH;
    sb.append((big-small)*n);
    bw.write(sb.toString());
    bw.flush();
  }
}
