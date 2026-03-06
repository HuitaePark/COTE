
import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    String s = br.readLine();
    s = s.trim();
    if (s.isEmpty()) System.out.println(0);
    else System.out.println(s.split("\\s+").length);
    }
}
