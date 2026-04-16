import java.util.*;
class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        int start = 0;
        int end = people.length-1;
        Arrays.sort(people);
        
        while(start<=end){
            int sum = people[start] + people[end];
            if(sum<=limit){
                answer++;
                start++;
                end--;
            }
            else{
                end--;
                answer++;
            }
        }
        return answer;
    }
}