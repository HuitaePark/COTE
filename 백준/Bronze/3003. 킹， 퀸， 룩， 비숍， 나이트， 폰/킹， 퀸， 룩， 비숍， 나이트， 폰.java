import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[6];
        int[] answer = new int[6];
        for (int i = 0; i < 6; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            if(i == 0) answer[i] = 1-arr[i];
            if(i == 1) answer[i] = 1-arr[i];
            if(i == 2) answer[i] = 2-arr[i];
            if(i == 3) answer[i] = 2-arr[i];
            if(i == 4) answer[i] = 2-arr[i];
            if(i == 5) answer[i] = 8-arr[i];
        }
        for (int i : answer){
            sb.append(i).append(" ");
        }
        System.out.println(sb);
    }
}