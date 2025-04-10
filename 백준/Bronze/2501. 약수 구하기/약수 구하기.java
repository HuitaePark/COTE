import java.util.*;
import java.io.*;

public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int count = 0;

        for(int i =1;i<=N;i++){
            if(N%i==0)
                count++;
            if(N==1){
                sb.append(0);
                break;
            }
            if(count==K){
                sb.append(i);
                break;
            }
        }
        if(count<K)
            sb.append(0);



        bw.write(sb.toString());
        bw.flush();
    }
}
