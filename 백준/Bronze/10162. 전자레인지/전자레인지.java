import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    int a = 300;
    int b = 60;
    int c = 10;

    int n = Integer.parseInt(br.readLine());

    int an = n/a;
    n = n%a;
    int bn = n/b;
    n = n%b;
    int cn = n/c;
    n = n%c;

    if(n!=0){
      System.out.println(-1);
      return;
    }
    else{
      sb.append(an+" "+bn+" "+cn);
    }
    bw.write(sb.toString());
    bw.flush();
    br.close();
    bw.close();
  }
}

