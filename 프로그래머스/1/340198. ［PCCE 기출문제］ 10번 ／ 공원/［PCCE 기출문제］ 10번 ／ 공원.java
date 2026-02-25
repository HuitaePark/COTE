class Solution {
    int[] mats;
    String[][] park;
    int answer = -1;
    public int solution(int[] mats, String[][] park) {
        this.mats = mats;
        this.park = park;
        for(int i=0;i<park.length;i++){
            for(int j=0;j<park[0].length;j++){
                if(park[i][j].equals("-1")){
                    matting(i,j);
                }
            }
        }
        return answer;
    }
    void matting(int r, int c){
    for(int k=0;k<mats.length;k++){
        int current = mats[k];

        if (r + current > park.length || c + current > park[0].length) continue;

        boolean isOk = true;

        for(int i = r; i < r + current && isOk; i++){
            for(int j = c; j < c + current; j++){
                if (!"-1".equals(park[i][j])) {
                    isOk = false;
                    break;
                }
            }
        }

        if(isOk) answer = Math.max(answer,current);
    }
}
}