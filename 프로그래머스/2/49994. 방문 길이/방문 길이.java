import java.util.*;
class Solution {
    public int solution(String dirs) {
        Set<String> set = new HashSet<>();
        int x = 0;
        int y = 0;
        for(int i=0;i<dirs.length();i++){
            char c = dirs.charAt(i);
            int nx = 0;
            int ny = 0;
            switch(c){
                case 'U':
                    nx = x;
                    ny = y+1;
                    if(nx>5 || nx<-5 || ny>5 || ny<-5) continue;
                    set.add(x+","+y+","+nx+","+ny);
                    set.add(nx+","+ny+","+x+","+y);
                    x = nx;
                    y = ny;
                    break;
                case 'D':
                    nx = x;
                    ny = y-1;
                    if(nx>5 || nx<-5 || ny>5 || ny<-5) continue;
                    set.add(x+","+y+","+nx+","+ny);
                    set.add(nx+","+ny+","+x+","+y);
                    x = nx;
                    y = ny;
                    break;
                case 'L':
                    nx = x-1;
                    ny = y;
                    if(nx>5 || nx<-5 || ny>5 || ny<-5) continue;
                    set.add(x+","+y+","+nx+","+ny);
                    set.add(nx+","+ny+","+x+","+y);
                    x = nx;
                    y = ny;
                    break;
                case 'R':
                    nx = x+1;
                    ny = y;
                    if(nx>5 || nx<-5 || ny>5 || ny<-5) continue;
                    set.add(x+","+y+","+nx+","+ny);
                    set.add(nx+","+ny+","+x+","+y);
                    x = nx;
                    y = ny;
                    break;
            }
        }
        return set.size()/2;
    }
}