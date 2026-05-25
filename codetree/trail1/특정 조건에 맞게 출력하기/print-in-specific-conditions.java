import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int[] arr = new int[100];

        st = new StringTokenizer(br.readLine());

        for(int i=0;i<100;i++){
            int current = Integer.parseInt(st.nextToken());
            if(current==0) break;
            arr[i] = current;
        }
        for(int i=0;i<100;i++){
            int current = arr[i];
            if(current==0) break;
            if(current%2==0) sb.append(current/2).append(" ");
            else sb.append(current+3).append(" ");
        }
        System.out.print(sb);
    }
}