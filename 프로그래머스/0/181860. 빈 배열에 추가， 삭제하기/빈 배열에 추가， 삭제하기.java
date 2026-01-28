import java.util.*;
class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        Deque<Integer> dq = new ArrayDeque<>();
        for(int i =0;i<flag.length;i++){
            if(flag[i]){
                for(int j=0;j<arr[i]*2;j++){
                    dq.offerLast(arr[i]);
                }
            }
            else{
                for(int j=0;j<arr[i];j++){
                    dq.pollLast();
                }
            }
        }
        int[] answer = new int[dq.size()];
        for(int i =0;i<answer.length;i++){
            answer[i] = dq.pollFirst();
        }
        return answer;
    }
}