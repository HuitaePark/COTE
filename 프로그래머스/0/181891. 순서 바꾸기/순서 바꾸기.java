import java.util.*;
class Solution {
    public Integer[] solution(int[] num_list, int n) {
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0;i<num_list.length;i++){
            q.add(num_list[i]);
        }
        for(int i = 0;i<n;i++){
            int po = q.poll();
            q.add(po);
        }
        List<Integer> list = new ArrayList<>();
        while(!q.isEmpty()){
            list.add(q.poll());
        }
        
        return list.stream().toArray(Integer[]::new);
        
        
    }
}