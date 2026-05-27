import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int min = Integer.MAX_VALUE;
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine().trim());
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            int current = Integer.parseInt(st.nextToken());
            min = Math.min(min,current);
            arr[i] = current;
        }

        int count = 0;
        for(int i=0;i<n;i++){
            if(arr[i]==min) count++;
        }
        sb.append(min).append(" ").append(count);
        System.out.print(sb);
    }
}