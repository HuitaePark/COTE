import java.util.*;
class Solution {
    // 범위를 초과하여 이동하는지 확인한다
    private static boolean isValidMove(int nx, int ny){
            return 0 <= nx && nx < 11 && 0 <= ny && ny <11;
        }
    //좌표이동계
    private static final HashMap<Character,int[]> location = new HashMap<>(); 
    
    //좌표 꺼내쓰는거
    private static void initLocation(){
        location.put('U',new int[]{0,1});
        location.put('D',new int[]{0,-1});
        location.put('L',new int[]{-1,0});
        location.put('R',new int[]{1,0});
    }
    
    public int solution(String dirs) {
        initLocation(); //좌표 초기화
        int x = 5,y = 5; //0,0을 5,5라 가정
        HashSet<String> answer = new HashSet<>();
        for(int i= 0;i<dirs.length();i++){
            int[] offset = location.get(dirs.charAt(i)); //키값으로 좌표계에서 꺼내서 더함
            int nx = x + offset[0];
            int ny = y + offset[1];
            if(!isValidMove(nx,ny))
                continue;
            answer.add(x+" "+y+" "+nx+" "+ny+" ");
            answer.add(nx+" "+ny+" "+x+" "+y+" ");
            
            x = nx;
            y = ny;
        }
        
        
        
        
        
        
        return answer.size()/2; //두번 더했으므로 나눈다
    }
}