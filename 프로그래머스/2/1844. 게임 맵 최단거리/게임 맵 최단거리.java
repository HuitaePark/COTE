import java.util.*;
class Solution {
	public int solution(int[][] maps) {
        int n = maps.length;
        int m = maps[0].length;
        boolean[][] visited = new boolean[n][m];
        Queue<Pair> q = new ArrayDeque<>();
        q.offer(new Pair(0,0,1));
        visited[0][0] = true;
        
        int[] dr = {1,-1,0,0};
        int[] dc = {0,0,1,-1};
        while(!q.isEmpty()){
            Pair current = q.poll();
            if(current.r==n-1 && current.c==m-1) return current.len;
            
            for(int dir=0;dir<4;dir++){
                int nr = current.r+dr[dir];
                int nc = current.c+dc[dir];
                if(nr<0 || nr>=n || nc<0 || nc>=m) continue;
                if(visited[nr][nc] || maps[nr][nc]==0) continue;
                visited[nr][nc] = true;
                q.offer(new Pair(nr,nc,current.len+1));
            }
        }
        
		return -1;
	}
    static class Pair{
        int r,c,len;
        public Pair(int r, int c,int len){
            this.r = r;
            this.c = c;
            this.len = len;
        }
    }
}