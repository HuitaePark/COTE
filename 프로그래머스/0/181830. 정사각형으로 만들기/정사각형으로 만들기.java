class Solution {
    public int[][] solution(int[][] arr) {
        int r = arr.length;
        int c = arr[0].length;
        int max = Math.max(r,c);
        int min = Math.min(r,c);
        int[][] answer = new int[max][max];
        for(int i=0;i<max;i++){
            for(int j=0;j<max;j++){
                if(min==r && i>=min) answer[i][j] = 0;
                else if(min==c && j>=min) answer[i][j] = 0;
                else answer[i][j] = arr[i][j];
            }
        }
        
        return answer;
    }
}