import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int sum = 0;
        st = new StringTokenizer(br.readLine());
        for(int i=1;i<=10;i++){
            int current = Integer.parseInt(st.nextToken());
            if(i==3 || i==5 || i==10) sum+=current;
        }
        sb.append(sum);
        System.out.print(sb);
    }
}