import java.util.*;
import java.io.*;

public class Main {


    static boolean[][] answer;
    static int N; 

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        

        N = Integer.parseInt(br.readLine());
        

        answer = new boolean[N][N];
        

        makeStar(0, 0, N);
        

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (answer[i][j]) {
                    sb.append('*');
                } else {
                    sb.append(' ');
                }
            }
            sb.append('\n');
        }
        

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
    
    
    static void makeStar(int r, int c, int n) {

        if (n == 1) {
            answer[r][c] = true;
            return;
        }
        
        int size = n / 3;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == 1 && j == 1) {
                    continue;
                }
                makeStar(r + i * size, c + j * size, size);
            }
        }
    }
}
