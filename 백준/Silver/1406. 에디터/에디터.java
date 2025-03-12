import java.util.*;
import java.io.*;

public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    String str = br.readLine();
    int n = Integer.parseInt(br.readLine());
    
    List<Character> list = new LinkedList<>();
    for(int i = 0; i < str.length(); i++) {
			list.add(str.charAt(i));
		}
    
    //iterator 메소드 호출 
	ListIterator<Character> iter = list.listIterator();
    //처음 커서는 문장의 맨 뒤에 있어야하기 때문에 커서를 맨뒤로 이동시켜줌 
	while(iter.hasNext()) {
			iter.next();
		}
    
    for(int i = 0;i<n;i++){
      String s = br.readLine();
      char cc = s.charAt(0);

      switch(cc){
        case 'L':
          if(iter.hasPrevious())
            iter.previous();
          break;
        case 'D':
          if(iter.hasNext())
            iter.next();
          break;
        case 'B':
          if(iter.hasPrevious()){
            iter.previous();
            iter.remove();
          }
          break;
            
        case 'P':
          char t = s.charAt(2);
          iter.add(t);
          break;
        
        default:
          break;
      }
    }
    for(char c : list)
      bw.write(c);
      
    bw.flush();
  }
    
}
