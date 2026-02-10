import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        Queue<Integer> q = new ArrayDeque<>();
        for(int i = 0;i<arr.length;i++){
            if(!q.isEmpty()&&arr[i]==2){
                while(!q.isEmpty()){
                    list.add(q.poll());
                }
                q.offer(2);
                continue;
            }
            else if(q.isEmpty()&&arr[i]==2){
                q.offer(2);
                continue;
            }
            if(!q.isEmpty()){
                q.add(arr[i]);
            }
        }
        if(!q.isEmpty()&&q.peek()==2) list.add(2);
        return list.isEmpty()? new int[]{-1} : list.stream().mapToInt(Integer::intValue).toArray();
    }
}