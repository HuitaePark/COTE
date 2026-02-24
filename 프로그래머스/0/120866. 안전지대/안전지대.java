class Solution {
    int r, c;
    int[][] danger;

    public int solution(int[][] board) {
        r = board.length;
        c = board[0].length;
        danger = new int[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (board[i][j] == 1) mark(i, j);
            }
        }

        int answer = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (danger[i][j] == 0) answer++;
            }
        }
        return answer;
    }

    void mark(int x, int y) {
        for (int i = x - 1; i <= x + 1; i++) {
            for (int j = y - 1; j <= y + 1; j++) {
                if (i < 0 || i >= r || j < 0 || j >= c) continue;
                danger[i][j] = 1;
            }
        }
    }
}