import java.util.*;
import java.io.*;

public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        Deque<Integer> stack = new ArrayDeque<>();
        int k = Integer.parseInt(br.readLine());
        for(int i=0;i<k;i++){
            int n = Integer.parseInt(br.readLine());
            if(n==0){
                stack.pop();
            }
            else{
                stack.push(n);
            }
        }
        int sum = 0;
        while(!stack.isEmpty()){
            sum+=stack.pop();
        }
        sb.append(sum);


        bw.write(sb.toString());
        bw.flush();

    }
}