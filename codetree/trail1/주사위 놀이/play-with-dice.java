import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int[] arr = new int[6];

        st = new StringTokenizer(br.readLine());
        for(int i=0;i<10;i++){
            int current = Integer.parseInt(st.nextToken());
            arr[current-1]++;
        }

        for(int i=0;i<arr.length;i++){
            sb.append(i+1).append(" - ").append(arr[i]).append("\n");
        }
        System.out.print(sb);
    }
}