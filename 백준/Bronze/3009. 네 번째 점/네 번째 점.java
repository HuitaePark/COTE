import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    int[] x = new int[3];
    int[] y = new int[3];
    
    int[] xarr = new int[1001];
    int[] yarr = new int[1001];
    
    for(int i =0;i<3;i++){
      StringTokenizer st = new StringTokenizer(br.readLine());
      x[i] = Integer.parseInt(st.nextToken());
      y[i] = Integer.parseInt(st.nextToken());
    }
    
    for(int i =0;i<3;i++){
      xarr[x[i]]++;
      yarr[y[i]]++;
    }
    
    for(int i =0;i<xarr.length;i++){
      if(xarr[i]==1)
        sb.append(i);
    }
    sb.append(" ");
    
     for(int i =0;i<yarr.length;i++){
      if(yarr[i]==1)
        sb.append(i);
    }
    

     bw.write(sb.toString());
     bw.flush();
  
  }
}
