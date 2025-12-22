import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    int n = Integer.parseInt(br.readLine());
    
    for(int i = 0;i<n;i++){
      char[] charArr = br.readLine().toCharArray();
      LinkedList<Character> list = new LinkedList<>();
      ListIterator<Character> it = list.listIterator();
      
      for(int j = 0;j<charArr.length;j++){  
        switch(charArr[j]){
            case '<':
              if(it.hasPrevious())
                it.previous();
              break;
            case '>':
              if(it.hasNext())
                it.next();
              break;
            case '-':
              if(it.hasPrevious()){
                it.previous();
                it.remove();
              }
              break;
            default:
              it.add(charArr[j]);
              break;
          }
      }
      for(Character ch : list){
        sb.append(ch);
      }
      sb.append("\n");
    }
    
    bw.write(sb.toString());
    bw.flush();
  
  }
}
