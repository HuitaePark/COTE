class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder(); // StringBuilder 사용으로 성능 향상
        int cnt = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            if (c == ' ') {
                cnt = 0; // 공백을 만나면 카운트를 초기화
                answer.append(c); // 공백은 그대로 추가
            } else {
                // 짝수 인덱스는 대문자, 홀수 인덱스는 소문자
                if (cnt % 2 == 0) {
                    answer.append(Character.toUpperCase(c));
                } else {
                    answer.append(Character.toLowerCase(c));
                }
                cnt++;
            }
        }

        return answer.toString();
    }
}