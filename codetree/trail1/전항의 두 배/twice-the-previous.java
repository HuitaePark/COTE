import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int[] arr = new int[10];

        arr[0] = a;
        arr[1] = b;

        for(int i = 2;i<arr.length;i++){
            arr[i] = arr[i-1] + 2*arr[i-2];
        }

        for(int i=0;i<arr.length;i++){
            sb.append(arr[i]).append(" ");
        }

        System.out.print(sb);
    }
}