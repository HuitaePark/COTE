import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        for(int i = 0;i<answer.length;i++){
            answer[i] = Integer.MAX_VALUE;
        }
       
        
        for(int i = 0;i<queries.length;i++){
            boolean isExist = false;
            for(int j  = queries[i][0]; j <=queries[i][1];j++){
                if(arr[j]>queries[i][2]){
                    isExist = true;
                    if(arr[j]<answer[i]) answer[i] = arr[j];                
                }
            }
            if(!isExist){
                answer[i] = -1;
                }
        }   
        return answer;
    }
    
}