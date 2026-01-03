import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    int n = Integer.parseInt(br.readLine());

    for(int i = 0;i<n;i++){
      String func = br.readLine();
      int count = Integer.parseInt(br.readLine());
      boolean isForward = true; 
      Deque<Integer> dq = new ArrayDeque<>();
      String input = br.readLine();
      input = input.substring(1, input.length() - 1);
      String[] arr = input.split(",");
      
      for(int j = 0;j<count;j++){
        dq.addLast(Integer.parseInt(arr[j]));
      }

      boolean isError = false;
      for(int j = 0;j<func.length();j++){
        char c = func.charAt(j);
        switch(c){
          case 'R':
            if(isForward){
              isForward = false;
            }
            else{
              isForward = true;
            }
            break;
          case 'D':
            if(!dq.isEmpty()){
              if(isForward){
                dq.removeFirst();
              }
              else{
                dq.removeLast();
              }
            }
            else{
              isError = true;
            }
            break;
        }
      }

      if(isError){
        sb.append("error").append("\n");
      }
      else{
        if(isForward){
          sb.append(dq.toString().replace(" ","")).append("\n");
        }
        else{
          StringBuilder tmp = new StringBuilder();
          sb.append("[");
          while(!dq.isEmpty()&&dq.size()!=1){
            sb.append(dq.removeLast());
            sb.append(",");
          }
          if(!dq.isEmpty())sb.append(dq.removeLast());
          sb.append("]");
          sb.append(tmp).append("\n");
        }
      }
    }
    
    bw.write(sb.toString());
    bw.flush();
  
  }
}
