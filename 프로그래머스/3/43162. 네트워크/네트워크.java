import java.util.*;
class Solution {
    boolean[] visited;
    public int solution(int n, int[][] computers) {
        int answer = 0;
        visited = new boolean[n];
        for(int i=0;i<n;i++){
            if(!visited[i]){
                dfs(i,computers,n);
                answer++;
            }
        }
        return answer;
    }
    void dfs(int node,int[][] computers,int n){
        visited[node] = true;
        
        for(int j=0;j<n;j++){
            if(j!=node && !visited[j] && computers[node][j]==1){
                dfs(j,computers,n);
            }
        }
    }
}