import java.util.*;

class Solution {
    public int solution(int[] array, int n) {
        Arrays.sort(array);
        int min = Integer.MAX_VALUE;
        int answer = array[0];

        for(int i = 0; i < array.length; i++){
            int diff = Math.abs(n - array[i]);
            if(min > diff){
                min = diff;
                answer = array[i]; 
            }
        }
        return answer;
    }
}