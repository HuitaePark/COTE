import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    int n = Integer.parseInt(br.readLine());
    int[] arr = new int[26];
    
    for(int i=0;i<n;i++){
      int value = 1;
      String current = br.readLine();
      for(int j=current.length()-1;j>=0;j--){
        int index = current.charAt(j)-'A';
        arr[index]+=value;
        value*=10;
      }
    }

    Arrays.sort(arr);
    int alphabet = 9;
    int sum = 0;
    for(int i=25;i>=0;i--){
      if(arr[i]==0) break;
      sum+=arr[i]*alphabet;
      alphabet--;
    }
    
    sb.append(sum);
    bw.write(sb.toString());
    bw.flush();
    br.close();
    bw.close();
  }

}
