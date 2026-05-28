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

        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }   

        int end = n - 1;
        int start = 0;

        while(true){
            int max = Integer.MIN_VALUE;

            for(int i = start; i <= end; i++){
                max = Math.max(max, arr[i]);
            }

            for(int i = start; i <= end; i++){
                if(arr[i] == max){
                    sb.append(i + 1).append(" ");

                    if(i == 0){
                        System.out.print(sb);
                        return;
                    }

                    end = i - 1;
                    break;
                }
            }
        }
    }
}