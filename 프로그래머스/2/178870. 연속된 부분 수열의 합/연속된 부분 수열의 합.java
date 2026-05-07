class Solution {
    public int[] solution(int[] sequence, int k) {
        int[] answer = new int[2];
        int minLen = Integer.MAX_VALUE;
        int start = 0;
        int end = 0;
        int sum = sequence[0];
        while(start<=end&& end < sequence.length){
            if(sum<k){
                end++;
                if (end < sequence.length) {
                    sum += sequence[end];
                }
            }
            else if(sum==k){
                if(end-start<minLen){
                    answer[0] = start;
                    answer[1] = end;
                    minLen = end - start;
                }
                sum-=sequence[start];
                start++;
            }
            else{
                sum-=sequence[start];
                start++;
            }
        }
        return answer;
    }
}