class Solution {
    public int solution(int[][] sizes) {
        int maxA = 0;
        int maxB = 0;

        for (int i = 0; i < sizes.length; i++) {
            if (sizes[i][1] > sizes[i][0]) {
                int tmp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = tmp;
            }
        }

        for (int i = 0; i < sizes.length; i++) {
            maxA = Math.max(maxA, sizes[i][0]);
            maxB = Math.max(maxB, sizes[i][1]);
        }

        return maxA * maxB;
    }
}