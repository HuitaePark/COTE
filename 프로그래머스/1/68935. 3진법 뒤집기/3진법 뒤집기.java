class Solution {
    public int solution(int n) {
        int answer = 0;
        int tmp = n;
        StringBuilder sb = new StringBuilder();
        while(n>0){
            sb.append(n%3);
            n/=3;
        }
        String reverse = sb.toString();
        for(char c : reverse.toCharArray()){
            answer = answer * 3 + (c-'0');
        }
        
        return answer;
    }
}