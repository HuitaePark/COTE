class Solution {
    public int solution(String A, String B) {
        int answer = 0;
        StringBuilder sb = new StringBuilder(A);
        while(!sb.toString().equals(B)){
            if(answer>=A.length()) return -1;
            char current = sb.charAt(sb.length()-1);
            sb.deleteCharAt(sb.length()-1);
            sb.insert(0,current);
            answer++;
        }
        return answer;
    }
}