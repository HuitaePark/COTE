import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        sb.append((int)Math.pow(2,n)-1).append("\n");
        func(1,3,n);
        bw.write(sb.toString());
        bw.flush();
    }
    static void func(int start, int end, int n){
      if(n==1){
        sb.append(start).append(" ").append(end).append("\n");
        return;
      }
      func(start,6-start-end,n-1);

      sb.append(start).append(" ").append(end).append("\n");

      func(6-start-end,end,n-1);
      
    }
}
