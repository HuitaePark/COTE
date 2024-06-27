class Solution {
    public String solution(String rsp) {
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < rsp.length(); i++) {
            char current = rsp.charAt(i);
            if (current == '2') {
                answer.append('0');
            } else if (current == '5') {
                answer.append('2');
            } else if (current == '0') {
                answer.append('5');
            }
        }
        return answer.toString();
    }
}
