import java.util.stream.*;
class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int start = 1;
        int end = IntStream.of(piles).max().orElse(0);
        int answer = 0;
        while(start<=end){
            int sum = 0;
            int mid = start + (end-start)/2;

            for(int i : piles){
                sum += Math.ceil((double) i / mid);
            }

            if(sum<=h){
                answer = mid;
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        
        return answer;
    }
}