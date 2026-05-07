class Solution {
    public int solution(int m, int n, int[][] puddles) {
        int answer = 0;
        int[][] dp = new int[n][m];
        for(int i=0;i<puddles.length;i++){
            dp[puddles[i][1]-1][puddles[i][0]-1] = -1;
        }
        dp[0][0] = 1;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i==0 && j==0) continue;
                if(dp[i][j]==-1) continue;
                
                int left = 0;
                int top = 0;
                if(j>0 && dp[i][j-1]!=-1) left = dp[i][j-1];
                if(i>0 && dp[i-1][j]!=-1) top =  dp[i-1][j];
                    
               dp[i][j] = (left + top) % 1000000007;
            }
        }
        
        return dp[n-1][m-1];
    }
}