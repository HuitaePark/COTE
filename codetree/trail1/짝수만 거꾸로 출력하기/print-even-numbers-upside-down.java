import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = arr.length-1;i>=0;i--){
            if(arr[i]%2 == 0) sb.append(arr[i]).append(" ");
        }

        System.out.print(sb);
    }
}