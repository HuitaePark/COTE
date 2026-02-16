import java.util.*;
class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<k;i++){
            boolean isExist = false;
            for(int j=0;j<arr.length;j++){
                if(!set.contains(arr[j])){
                    set.add(arr[j]);
                    answer[i] = arr[j];
                    isExist = true;
                    break;
                }
            }
            if(!isExist) answer[i] = -1;
        }
        return answer;
    }
}