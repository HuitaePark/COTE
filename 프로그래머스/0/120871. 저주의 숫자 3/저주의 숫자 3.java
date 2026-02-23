
class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i=1;i<=n;i++){
            answer++;
            while(answer%3==0 || isThree(answer)) answer++;
        }
        return answer;
    }
    boolean isThree(int i){
        String current = Integer.toString(i);
        for(int j=0;j<current.length();j++){
            if(current.charAt(j)=='3') return true;
        }
        return false;
    }
}