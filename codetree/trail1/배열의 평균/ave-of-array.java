import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int[][] arr = new int[2][4];

        for(int i=0;i<2;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<4;j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int i=0;i<2;i++){
            int sum = 0;
            for(int j=0;j<4;j++){
                sum+=arr[i][j];
            }
            sb.append(String.format("%.1f",(double)sum/4)).append(" ");
        }
        sb.append("\n");

        for(int i=0;i<4;i++){
            int sum = 0;
            for(int j=0;j<2;j++){
                sum+=arr[j][i];
            }
            sb.append(String.format("%.1f",(double)sum/2)).append(" ");
        }
        sb.append("\n");

        int sum = 0;
        for(int i=0;i<2;i++){
            for(int j=0;j<4;j++){
                sum+=arr[i][j];
            }
        }
        sb.append(String.format("%.1f",(double)sum/8)).append(" ");

        System.out.print(sb);
    }
}