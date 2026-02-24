class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int correct = 0;
        
        // i의 탐색 범위를 넉넉하게 -100부터 1000까지로 변경
        for(int i = -100; i <= 1000; i++){
            int sum = 0;
            for(int j = i - num + 1; j <= i; j++){
                sum += j;
            }
            if(sum == total){
                correct = i;
                break;
            }
        }
        
        for(int i = 0; i < answer.length; i++){
            answer[i] = correct - num + 1 + i;
        }
        return answer;
    }
}