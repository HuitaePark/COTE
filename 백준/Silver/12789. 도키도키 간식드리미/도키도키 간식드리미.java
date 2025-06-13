import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    int n = Integer.parseInt(br.readLine());
    
    Deque<Integer> stack = new ArrayDeque<>();
    List<Integer> list = new ArrayList<>();
    StringTokenizer st = new StringTokenizer(br.readLine());
    Queue<Integer> q = new LinkedList<>();
    
    for(int i = 0;i<n;i++){
     q.add(Integer.parseInt(st.nextToken()));
    }
    
    int min = 1;
    while(!q.isEmpty()){
      if(q.peek()==min){
        list.add(q.poll());
        min++;
      }
      else if(!stack.isEmpty()&&stack.peek()==min){
        list.add(stack.pop());
        min++;
      }
      else{
        stack.push(q.poll());
      }
    }

    for(int i = 0;i<stack.size();i++){
      if(stack.peek()==list.get(list.size()-1)+1){
        list.add(stack.pop());
      }
      else{
        sb.append("Sad");
        break;
      }
    }    
    
    if(sb.length()==0){
      sb.append("Nice");
    }



     bw.write(sb.toString());
     bw.flush();
  
  }
}
