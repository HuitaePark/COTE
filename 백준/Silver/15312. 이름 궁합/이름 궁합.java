import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    int[] arr = {3, 2, 1, 2, 3, 3, 2, 3, 3, 2, 2, 1, 2, 2, 1, 2, 2, 2, 1, 2, 1, 1, 1, 2, 2, 1};
    String m = br.readLine();
    String g = br.readLine();
    int n = m.length() + g.length();
    int[] name = new int[n+1];
    int count = 0;
    for(int i =0;i<m.length()*2;i+=2){
      name[i] = arr[m.charAt(count)-'A'];
      name[i+1] = arr[g.charAt(count)-'A'];
      count++;
    }
    while(n>2){
      for(int i=0;i<n-1;i++){
        int current = name[i] + name[i+1];
        if(current>9) name[i] = current%10;
        else name[i] = current;
      }
      n--;
    }
    sb.append(name[0]).append(name[1]);
    bw.write(sb.toString());
    bw.flush();
  }
}