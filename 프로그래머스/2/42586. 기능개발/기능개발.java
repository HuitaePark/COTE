import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> list = new ArrayList<>();
        
        Queue<Integer> q = new ArrayDeque<>();
        int cursor = 0;
        int percent = 1;
        
        for(int i =0;i<speeds.length;i++){
            q.offer(progresses[i]);
        }
        
        while(!q.isEmpty()){
            int count = 0;
            
            while(!q.isEmpty()
                  &&q.peek()+percent*speeds[cursor]>=100){
                q.poll();
                count++;
                cursor++;
            }
            if(count>0){
                list.add(count);
            }
            percent++;
        }
        
        return list
            .stream()
            .mapToInt(Integer::intValue)
            .toArray();
    }
}