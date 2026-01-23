class Solution {
    public int solution(int[][] sizes) {
        int wMax= 0;
        int hMax =0;
        for(int i = 0;i<sizes.length;i++){
            int tmp = 0;
            if(sizes[i][0]<sizes[i][1]){
                tmp = sizes[i][1];
                sizes[i][1] = sizes[i][0];
                sizes[i][0] = tmp;
            }
        }
        
        for(int i = 0;i<sizes.length;i++){
            wMax = Math.max(sizes[i][0],wMax);
            hMax = Math.max(sizes[i][1],hMax);
        }
        
        return wMax*hMax;
    }
}