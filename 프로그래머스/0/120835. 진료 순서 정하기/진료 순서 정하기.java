import java.util.*;
class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        Map<Integer,Integer> map = new HashMap<>();
        int[] arr = new int[emergency.length];
        
        for(int i=0;i<arr.length;i++){
            arr[i] = emergency[i];
        }
        
        Arrays.sort(arr);
        int count = arr.length;
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],count);
            count--;
        }
        
        for(int i=0;i<emergency.length;i++){
            answer[i] = map.get(emergency[i]);
        }
        
        return answer;
    }
}