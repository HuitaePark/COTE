import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int max = 0;

        for(int i=n-1;i>=0;i--){
            for(int j=i-1;j>=0;j--){
                int current = arr[i]-arr[j];
                max = Math.max(max,current);
            }
        }
        sb.append(max);
        System.out.print(sb);
    }
}