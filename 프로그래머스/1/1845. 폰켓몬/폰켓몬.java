import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int number = nums.length/2;
        Set<Integer> set = new HashSet<>();
        for(int i : nums){
            set.add(i);
        }
        return set.size()>=number? number : set.size();
    }
}