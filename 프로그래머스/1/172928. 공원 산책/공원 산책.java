import java.util.*;
class Solution {    
    public int[] solution(String[] park, String[] routes) {
        int r = 0;
        int c = 0;
        int maxR  = park.length;
        int maxC = park[0].length();
        boolean[][] visited = new boolean[maxR][maxC];
        for(int i = 0;i<maxR;i++){
            String current = park[i];
            for(int j=0;j<maxC;j++){
                if(current.charAt(j)=='S'){
                    r = i;
                    c = j;
                }
                else if(current.charAt(j)=='X'){
                    visited[i][j] = true;
                }
            }
        }
        a:for(int i=0;i<routes.length;i++){
            StringTokenizer st = new StringTokenizer(routes[i]);
            String dir = st.nextToken();
            int count = Integer.parseInt(st.nextToken());
            int nr,nc;
            switch(dir){
                case "E":
                    nr = r;
                    nc = c+count;
                    if(nc>=maxC) continue;
                    for(int j=c;j<=c+count;j++){
                        if(visited[nr][j]) continue a;
                    }
                    r = nr;
                    c = nc;
                    break;
                case "W":
                    nr = r;
                    nc = c-count;
                    if(nc<0) continue;
                    for(int j=c;j>=c-count;j--){
                        if(visited[nr][j]) continue a;
                    }
                    r = nr;
                    c = nc;
                    break;
                case "N":
                    nr = r-count;
                    nc = c;
                    if(nr<0) continue;
                    for(int j=r;j>=r-count;j--){
                        if(visited[j][nc]) continue a;
                    }
                    r = nr;
                    c = nc;
                    break;
                case "S":
                    nr = r+count;
                    nc = c;
                    if(nr>=maxR) continue;
                    for(int j=r;j<=r+count;j++){
                        if(visited[j][nc]) continue a;
                    }
                    r = nr;
                    c = nc;
                    break;
            }
        }
        return new int[]{r,c};
    }
}