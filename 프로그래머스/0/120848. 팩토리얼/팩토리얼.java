class Solution {
    public int solution(int n) {
        int answer = 1;
        for(int i=0;i<10;i++){
            answer*=(i+1);
            if(answer>n) return i;
        }
        return 10;
    }
}