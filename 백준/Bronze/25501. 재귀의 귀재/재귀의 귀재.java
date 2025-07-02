import java.util.*;
import java.io.*;
  
public class Main{
  static int count = 0;
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    int n= Integer.parseInt(br.readLine());
    for(int i = 0;i<n;i++){
       count = 0;
       String str = br.readLine();
       sb.append(isPelindrome(str)).append(" ").append(count).append("\n");
    }

     bw.write(sb.toString());
     bw.flush();
  
  }
  private static int isPelindrome(String st){
    return recursion(st,0,st.length()-1);
  }
  private static int recursion(String s,int l,int r){
    count++;
    if(l>=r) return 1;
    else if(s.charAt(l)!=s.charAt(r)) return 0;
    else return recursion(s,l+1,r-1);
  }
}
