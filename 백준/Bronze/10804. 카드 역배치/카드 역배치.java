import java.util.*;
import java.io.*;

public class Main {
    public static void reverseSubArray(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] arr = new int[20];

        for (int i = 0; i < 20; i++) {
            arr[i] = i + 1;  
        }

        for (int i = 0; i < 10; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken()) - 1; 
            int b = Integer.parseInt(st.nextToken()) - 1; 

            reverseSubArray(arr, a, b);
        }

        for (int i : arr) {
            bw.write(i + " ");
        }

        bw.flush();
    }
}

