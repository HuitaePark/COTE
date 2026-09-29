import java.util.*;
class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        Queue<Long> q = new PriorityQueue<>();
        for(int i=0;i<scoville.length;i++){
            q.offer((long)scoville[i]);
        }
        
        while(q.size()>1 && q.peek()<K){
            long first = q.poll();
            long second = q.poll();
            q.offer(first + second*2);
            answer++;
        }
        
        if (q.peek() < K) {
            return -1;
        }

        return answer;
    }
}