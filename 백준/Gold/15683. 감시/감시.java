import java.io.*;
import java.util.*;

public class Main {

    static int r, c;
    static int[][] board1; // 입력 원본
    static int[][] board2; // 시뮬레이션용
    static ArrayList<int[]> cctv = new ArrayList<>();

    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};

    static boolean OOB(int x, int y) {
        return x < 0 || x >= r || y < 0 || y >= c;
    }

    static void upd(int x, int y, int dir) {
        dir %= 4;
        while (true) {
            x += dx[dir];
            y += dy[dir];
            if (OOB(x, y) || board2[x][y] == 6) return;
            if (board2[x][y] != 0) continue; 
            board2[x][y] = 7;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());

        board1 = new int[r][c];
        board2 = new int[r][c];

        int mn = 0; // 처음엔 빈칸 개수로 세팅 (최솟값 갱신)
        for (int i = 0; i < r; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < c; j++) {
                board1[i][j] = Integer.parseInt(st.nextToken());
                if (board1[i][j] != 0 && board1[i][j] != 6) {
                    cctv.add(new int[]{i, j});
                }
                if (board1[i][j] == 0) mn++;
            }
        }

        int k = cctv.size();
        int limit = 1 << (2 * k); 

        for (int tmp = 0; tmp < limit; tmp++) {
            for (int i = 0; i < r; i++) {
                System.arraycopy(board1[i], 0, board2[i], 0, c);
            }

            int brute = tmp;
            for (int i = 0; i < k; i++) {
                int dir = brute % 4;
                brute /= 4;

                int x = cctv.get(i)[0];
                int y = cctv.get(i)[1];
                int type = board1[x][y];

                if (type == 1) {
                    upd(x, y, dir);
                } else if (type == 2) {
                    upd(x, y, dir);
                    upd(x, y, dir + 2);
                } else if (type == 3) {
                    upd(x, y, dir);
                    upd(x, y, dir + 1);
                } else if (type == 4) {
                    upd(x, y, dir);
                    upd(x, y, dir + 1);
                    upd(x, y, dir + 2);
                } else { // type == 5
                    upd(x, y, dir);
                    upd(x, y, dir + 1);
                    upd(x, y, dir + 2);
                    upd(x, y, dir + 3);
                }
            }

            int val = 0;
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    if (board2[i][j] == 0) val++;
                }
            }
            mn = Math.min(mn, val);
        }

        System.out.print(mn);
    }
}
