import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int[] arr = new int[10];
        arr[0] = a;
        arr[1] = b;
        for(int i=2;i<10;i++){
            arr[i] = arr[i-1]+arr[i-2];
        }

        for(int i=0;i<10;i++){
            String current = Integer.toString(arr[i]);
            sb.append(current.charAt(current.length()-1)).append(" ");
        }

        System.out.print(sb);
    }
}