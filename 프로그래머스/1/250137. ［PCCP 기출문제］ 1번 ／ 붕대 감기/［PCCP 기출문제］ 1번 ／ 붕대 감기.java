class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int combo = 0;
        int base = health;
        for(int i = 1;i<=attacks[attacks.length-1][0];i++){
            int currentTime = i;
            boolean isAttacked = false;
            //공격 확인
            for(int j=0;j<attacks.length;j++){
                if(attacks[j][0]==currentTime){
                    isAttacked = true;
                    health-=attacks[j][1];
                    combo=0;
                }
                if(health<=0) return -1;
            }
            //공격을 안받았을시
            if(!isAttacked){
                ++combo;
                if(combo==bandage[0]){
                    health+=bandage[1]+bandage[2];
                    if(health>base) health = base;
                    combo=0;
                }
                else{
                    health+=bandage[1];
                    if(health>base) health = base;
                }
            }
        }
        
        return health;
    }
}