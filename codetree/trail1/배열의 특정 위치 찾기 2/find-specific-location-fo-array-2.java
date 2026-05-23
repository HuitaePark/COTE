import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int even = 0;
        int odd = 0;

        st = new StringTokenizer(br.readLine());
        for(int i=0;i<10;i++){
            int current = Integer.parseInt(st.nextToken());

            if(i%2==0) even +=current;
            else odd += current;
        }
        sb.append(Math.abs(odd-even));
        System.out.print(sb);
    }
}