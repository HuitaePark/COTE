class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int max = Math.max(sides[0],sides[1]);
        int min = Math.min(sides[0],sides[1]);
        int start = max-min+1;
        while(start<=max){
            answer++;
            start++;
        }
        
        start = max-min+1+min;
        while(start<max+min){
            start++;
            answer++;
        }
        return answer;
    }
}