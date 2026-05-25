import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[1001];
        arr[0] = 1;
        arr[1] = n;
        for(int i=2;i<arr.length;i++){
            arr[i] = arr[i-1] + arr[i-2];
            if(arr[i]>100) break;
        }

        for(int i=0;i<arr.length;i++){
            if(arr[i]==0) break;
            sb.append(arr[i]).append(" ");
        }

        System.out.print(sb);
    }
}