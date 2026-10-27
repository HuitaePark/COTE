import java.util.*;
class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int time = 0;
        int sum = 0;
        int idx = 0;
        Queue<Integer> bridgeQ = new LinkedList<>();
        
        //다리를 0으로 채우기
        for (int i = 0; i < bridge_length; i++) {
            bridgeQ.offer(0);
        }
        
        while(idx<truck_weights.length){
            time++;
            
            sum-= bridgeQ.poll();
            
            if(sum+truck_weights[idx]<=weight){ //진입 가능하다면 삽입 후 인덱스 옮기기
                bridgeQ.offer(truck_weights[idx]);
                sum+=truck_weights[idx];
                idx++;
            }
            else { //진입 불가능하면 빈 공간 추가
                bridgeQ.offer(0);
            }
        }
        
        return time+bridge_length;
    }
}