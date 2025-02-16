import java.io.*;
import java.util.*;

public class Main {
    static int factorial(int n){

        if(n == 1){
            return 1;
        }
        else if(n == 0){
            return 1;
        }
        else {
            return n* factorial(n - 1);
        }
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        long answer = factorial(N)/factorial(N-K)/factorial(K);

        bw.write(Long.toString(answer));
        bw.flush();
    }
}
