class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int x = 0;
        int y= 0;
        for(int i=0;i<keyinput.length;i++){
            if(keyinput[i].equals("left")){
                if(board[0]/2>=Math.abs(x-1)) x--;
            }
            else if(keyinput[i].equals("right")){
                if(board[0]/2>=x+1) x++;
            }            
            else if(keyinput[i].equals("up")){ 
                if(board[1]/2>=y+1) y++;
            }
            else if(keyinput[i].equals("down")){
                if(board[1]/2>=Math.abs(y-1)) y--;
            }
        }
        return new int[]{x,y};
    }
}