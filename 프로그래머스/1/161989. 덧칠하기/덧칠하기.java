class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int idx = 0;
        while(true){
            if(idx==section.length) break;
            
            answer++;
            
            int current = section[idx];
            if(current+m-1>=n) break;
            
            while(section[idx]<=current+m-1){
                idx++;
                if(idx==section.length) break;
            }
        }
        return answer;
    }
}