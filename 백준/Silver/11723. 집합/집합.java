import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    int n = Integer.parseInt(br.readLine());
    Set<Integer> set = new HashSet<>();
    for(int i =0;i<n;i++){
      String str = br.readLine();
      String[] arr = str.split(" ");
      switch(arr[0]){
        case "add":
          set.add(Integer.parseInt(arr[1]));
          break;
        case "remove":
          if(set.contains(Integer.parseInt(arr[1]))){
            set.remove(Integer.parseInt(arr[1]));
          }
          break;
        case "check":
          if(set.contains(Integer.parseInt(arr[1]))){
            sb.append(1).append("\n");
          }
          else{
            sb.append(0).append("\n");
          }
          break;
        case "toggle":
          if(set.contains(Integer.parseInt(arr[1]))){
            set.remove(Integer.parseInt(arr[1]));
          }
          else{
            set.add(Integer.parseInt(arr[1]));
          }
          break;
        case "all":
          set.clear();
          for(int j = 1;j<=20;j++){
            set.add(j);
          }
          break;
        case "empty":
          set.clear();
          break;
      }
        
        
    }





     bw.write(sb.toString());
     bw.flush();
  
  }
}
