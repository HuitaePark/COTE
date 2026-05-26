import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int count = 0;

        for(int i=0;i<n;i++){
            int current = Integer.parseInt(st.nextToken());
            if(current==m) count++;
        }

        sb.append(count);
        System.out.print(sb);
    }
}