import java.util.*;

class Solution {
    public int[][] solution(int n) {
        int[][] a = new int[n][n];

        // 오른쪽, 아래, 왼쪽, 위
        int[] dr = {0, 1, 0, -1};
        int[] dc = {1, 0, -1, 0};

        int r = 0, c = 0, d = 0; // 시작 (0,0), 방향=오른쪽
        for (int k = 1; k <= n * n; k++) {
            a[r][c] = k;

            int nr = r + dr[d];
            int nc = c + dc[d];

            // 다음 칸이 막혔으면(밖이거나 이미 채움) 방향 회전
            if (nr < 0 || nr >= n || nc < 0 || nc >= n || a[nr][nc] != 0) {
                d = (d + 1) % 4;
                nr = r + dr[d];
                nc = c + dc[d];
            }

            r = nr;
            c = nc;
        }

        return a;
    }
}