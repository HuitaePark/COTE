class Solution {
    int[][] answer;
    int idx = 0;
    public int[][] solution(int n) {
        answer = new int[(1 << n) - 1][2];
        hanoi(n, 1, 3, 2);
        return answer;
    }
    void hanoi(int n, int start, int end, int via){
        if (n == 1) {
            answer[idx++] = new int[]{start, end};
            return;
        }
        
        hanoi(n - 1, start, via, end);

        answer[idx++] = new int[]{start, end};

        hanoi(n - 1, via, end, start);
    }
}