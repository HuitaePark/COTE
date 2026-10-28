class Solution {
    public int[] solution(int brown, int yellow) {
        int total = brown + yellow;
        
        for(int y=3;y*y<=total;y++){
            if(total%y==0){
                int x = total/y;
                
                if((x-2) * (y-2) == yellow) return new int[]{x,y};
            }
        }
        
        return new int[]{};
    }
}