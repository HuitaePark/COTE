import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    String s = br.readLine();
    List<Character> list = new ArrayList<>();
    for(int i=0;i<s.length();i++){
      list.add(s.charAt(i));
      if(list.size()>=4){
        if(list.get(list.size()-1)=='P'
          && list.get(list.size()-2)=='A'
          && list.get(list.size()-3)=='P'
          && list.get(list.size()-4)=='P'){
          list.remove(list.size()-1);
          list.remove(list.size()-1);
          list.remove(list.size()-1);
          }
      }
    }
    if(list.size()==1 && list.get(0)=='P') sb.append("PPAP");
    else  sb.append("NP");
    bw.write(sb.toString());
    bw.flush();
    br.close();
    bw.close();
  }
}
