class Solution {
    public int solution(String[][] board, int h, int w) {
        int answer = 0;
        int[] dx = {1,-1,0,0};
        int[] dy = {0,0,1,-1};
        for(int dir = 0;dir<4;dir++){
            int nx = w + dx[dir];
            int ny = h + dy[dir];
            if(nx<0 || nx>=board.length || ny<0 || ny>=board[0].length) continue;
            if(board[ny][nx].equals(board[h][w])) answer++;
        }
        return answer;
    }
}