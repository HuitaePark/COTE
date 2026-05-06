import java.util.*;
class Solution {
    int sum = 0;
    int answer = 0;
    
    public int solution(int[] numbers, int target) {
        dfs(numbers, target, 0, 0);
        return answer;
    }
    void dfs(int[] numbers,int target, int index, int currentSum){
            if(index==numbers.length){
                if(currentSum==target){
                    answer++;
                }
                return;
            }
        dfs(numbers,target,index+1,currentSum-numbers[index]);
        dfs(numbers,target,index+1,currentSum+numbers[index]);
    }
}