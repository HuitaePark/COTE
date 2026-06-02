import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[][] arr = new int[4][4];
        for(int i=0;i<4;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0;j<4;j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }

            int sum = 0;
            for(int j=0;j<4;j++){
                sum+=arr[i][j];
            }
            sb.append(sum).append("\n");
        }

        System.out.print(sb);
    }
}