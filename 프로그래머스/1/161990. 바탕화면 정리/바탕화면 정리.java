class Solution {
    public int[] solution(String[] wallpaper) {
        int lux = Integer.MAX_VALUE;
        int luy = Integer.MAX_VALUE;
        int rdx = Integer.MIN_VALUE;
        int rdy = Integer.MIN_VALUE;
        for(int i = 0;i<wallpaper.length;i++){
            String current = wallpaper[i];
            for(int j =0;j<current.length();j++){
                if(current.charAt(j)=='#'){
                    lux = Math.min(lux,i);
                    luy = Math.min(luy,j);
                    rdx = Math.max(rdx,i);
                    rdy = Math.max(rdy,j);
                }
            }
        }
        int[] answer = {lux,luy,rdx+1,rdy+1};
        return answer;
    }
}