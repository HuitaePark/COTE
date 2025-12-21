import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    String str = br.readLine();
    List<Character> list = new LinkedList<>();
    for(char ch : str.toCharArray()){
      list.add(ch);
    }
    int n = Integer.parseInt(br.readLine());
    ListIterator<Character> it = list.listIterator(list.size());
    
    for(int i  = 0;i<n;i++){
      String s = br.readLine();
      String[] arr = s.split(" ");
      switch(arr[0]){
        case "L":
          if(it.hasPrevious()) it.previous();
          break;
        case "D":
          if (it.hasNext()) it.next();
          break;
        case "B":
          if(it.hasPrevious()) {
            it.previous();
            it.remove();
          }
          break;
        case "P":
          it.add(arr[1].charAt(0));
          break;
      }
    }
    
    for(Character ch : list){
      sb.append(ch);
    }
    
    bw.write(sb.toString());
    bw.flush();
  
  }
}


  