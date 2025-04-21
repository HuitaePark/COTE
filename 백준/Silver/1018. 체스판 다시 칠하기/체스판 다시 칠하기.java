import java.util.*;
import java.io.*;

public class Main {
    public static int getSolution(int startRow, int startCol, String[] board) {
        String[] orgBoard = {"WBWBWBWB", "BWBWBWBW"};
        int white = 0;

        for (int i = 0; i < 8; i++) {
            int row = startRow + i;
            for (int j = 0; j < 8; j++) {
                int col = startCol + j;
                // 현재 칸이 체스판 규칙이랑 다르면 다시 칠해야 하니까 white++
                if (board[row].charAt(col) != orgBoard[row % 2].charAt(j)) {
                    white++;
                }
            }
        }
        // 시작이 W일 때 바꿔야 할 칸: white
        // 시작이 B일 때 바꿔야 할 칸: 64 - white
        // 둘 중에 더 적은 쪽이 최소 비용
        return Math.min(white, 64 - white);
    }

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int row = Integer.parseInt(st.nextToken());
        int col = Integer.parseInt(st.nextToken());

        String[] board = new String[row];
        for (int i = 0; i < row; i++) {
            board[i] = br.readLine();
        }

        int sol = Integer.MAX_VALUE;
        for (int i = 0; i <= row - 8; i++) {
            for (int j = 0; j <= col - 8; j++) { // 여기 수정됨 (등호 들어감)
                int cursol = getSolution(i, j, board);
                sol = Math.min(sol, cursol);
            }
        }

        sb.append(sol);
        bw.write(sb.toString());
        bw.flush();
    }
}
