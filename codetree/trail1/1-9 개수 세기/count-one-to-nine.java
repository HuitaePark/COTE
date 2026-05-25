import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int[] arr = new int[9];
        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        for(int i=0;i<n;i++){
            int current = Integer.parseInt(st.nextToken());
            arr[current-1]++;
        }

        for(int i=0;i<arr.length;i++){
            sb.append(arr[i]).append("\n");
        }

        System.out.print(sb);   
    }
}