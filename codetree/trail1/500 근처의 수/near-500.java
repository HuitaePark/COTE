import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        int[] arr = new int[10];
        for(int i=0;i<10;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for(int i=0;i<10;i++){
            if(500<arr[i] && arr[i]<min) min = arr[i];
            if(500>arr[i] && arr[i]>max) max = arr[i];
        }

        sb.append(max).append(" ").append(min);

        System.out.print(sb);
    }
}