class Solution {
    public int solution(int hp) {
        int generals = hp / 5;
        int remainderAfterGenerals = hp % 5;
        int armies = remainderAfterGenerals / 3;
        int scvs = remainderAfterGenerals % 3;

        int totalUnits = generals + armies + scvs;
        
        return totalUnits;
    }
}
