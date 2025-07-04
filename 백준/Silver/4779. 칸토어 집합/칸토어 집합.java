import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    String line;
    while((line=br.readLine())!=null){
      int n = Integer.parseInt(line);
      sb.append(kantore(n)).append("\n");
    }


     bw.write(sb.toString());
     bw.flush();
  
  }
  private static String kantore(int n){
    int spaceLength = (int) Math.pow(3, n - 1);
    if(n==0) return "-";
    else return kantore(n-1)+" ".repeat(spaceLength)+kantore(n-1);
  }
}
