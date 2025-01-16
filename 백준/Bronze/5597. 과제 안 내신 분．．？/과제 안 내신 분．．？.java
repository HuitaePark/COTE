import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[] arr = new int[31];
        for (int i = 0; i < 28; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            arr[n] = 1;
        }
        for (int i = 1; i <= 30; i++) {
            if (arr[i]==0){
                sb.append(i).append("\n");
            }
        }
        System.out.println(sb);
    }
}
