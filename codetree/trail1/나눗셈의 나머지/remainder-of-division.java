import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int[] arr = new int[b];
        while(a>1){
            arr[a%b]++;
            a/=b;
        }

        int sum = 0;

        for(int i=0;i<arr.length;i++){
            sum+=(arr[i]*arr[i]);
        }

        sb.append(sum);
        System.out.print(sb);
    }
}
