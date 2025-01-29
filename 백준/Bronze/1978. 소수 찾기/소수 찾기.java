import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int count = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        for (int i = 0; i < n; i++) {
            if(arr[i] < 2)
                continue;
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(arr[i]); j++) {
                if ((arr[i] % j) == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime) count++;
        }
        System.out.println(count);
    }
}