class Solution {
    public int solution(int n) {
        int answer = 1;
        boolean isSame = false;
        while(true){
            int sum = 1;
            for(int i =1;i<=answer;i++){
                sum*=i;
            }
            if(sum==n){
                isSame = true; 
                break;
            }
            else if(sum>n){
                break;
            }
            answer++;
        }
        if(isSame){
            return answer;
        }
        else{
            return answer-1;
        }
    }
}