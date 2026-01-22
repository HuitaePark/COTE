import java.util.*;
class Solution {
    public int[] solution(int[] numbers, String direction) {
        Deque<Integer> dq = new ArrayDeque<>();
        for(int i=0;i<numbers.length;i++){
            dq.offerLast(numbers[i]);
        }
        if(direction.equals("right")){
            dq.offerFirst(dq.pollLast());
        }
        else{
            dq.offerLast(dq.pollFirst()); 
        }
        
        return dq.stream().mapToInt(Integer::intValue).toArray();
    }
}