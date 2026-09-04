class Solution {
    public int solution(int n) {
        int answer = 0;
        int current = n;
        StringBuilder sb = new StringBuilder();
        while(current>0){
            sb.append(current%3);
            current/=3;
        }
        int tmp = 0;
        for(int i=sb.length()-1;i>=0;i--){
            answer += (sb.charAt(i) - '0') * (int) Math.pow(3, tmp);
            tmp++;
        }        
        return answer;
    }
}