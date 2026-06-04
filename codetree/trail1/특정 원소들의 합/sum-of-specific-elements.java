import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int[][] arr = new int[4][4];

        for(int i=0;i<4;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<4;j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int sum = 0;
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                if(j<=i) sum+=arr[i][j];
            }
        }
        sb.append(sum);
        System.out.print(sb);
    }
}