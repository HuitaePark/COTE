import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        String[][] arr = new String[5][3];

        for(int i=0;i<5;i++){
            String[] current = br.readLine().split(" ");
            for(int j=0;j<3;j++){
                arr[i][j] = current[j].toUpperCase();
            }
        }

        for(int i=0;i<5;i++){
            for(int j=0;j<3;j++){
                sb.append(arr[i][j]).append(" ");
            }
            sb.append("\n");
        }

        System.out.print(sb);
    }
}