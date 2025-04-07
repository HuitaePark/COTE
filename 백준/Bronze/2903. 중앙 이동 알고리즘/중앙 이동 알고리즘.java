import java.util.*;
import java.io.*;

public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringBuilder sb = new StringBuilder();
    
    int n = Integer.parseInt(br.readLine());
 
    System.out.println((int)Math.pow(Math.pow(2, n) +1, 2));
  }
}

