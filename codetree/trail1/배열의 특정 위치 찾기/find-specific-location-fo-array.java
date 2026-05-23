import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int odd = 0;
        int triple = 0;
        int count = 0;
        st = new StringTokenizer(br.readLine());
        for(int i=1;i<=10;i++){
            int current = Integer.parseInt(st.nextToken());
            if(i%2==0) odd+=current;
            if(i%3==0){
                triple+=current;
                count++;
            }
        }
        sb.append(odd).append(" ").append(String.format("%.1f",(double)triple/count));
        System.out.print(sb);
    }
}