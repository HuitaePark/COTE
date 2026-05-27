import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        int count = 0;
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            int current = Integer.parseInt(st.nextToken());
            if(current==2) count++;
            if(count==3){
                sb.append(i+1);
                break;
            }
        }

        System.out.print(sb);
    }
}