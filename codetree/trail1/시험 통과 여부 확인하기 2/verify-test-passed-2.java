import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        int count = 0;
        for(int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            int sum = 0;
            for(int j=0;j<4;j++){
                sum+=Integer.parseInt(st.nextToken());
            }
            if(sum/4>=60) {
                sb.append("pass\n");
                count++;
            }
            else sb.append("fail\n");
        }
        sb.append(count);
        System.out.print(sb);
    }
}