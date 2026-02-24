class Solution {
    public int solution(int[] common) {
        int len = common.length;
        if(common[len-1]-common[len-2] == common[len-2]-common[len-3]){
            return common[len-1]+(common[len-1]-common[len-2]);
        }
        else{
            return common[len-1] * (common[len-1]/common[len-2]);
        }
    }
}