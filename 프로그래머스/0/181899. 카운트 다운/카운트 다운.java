class Solution {
    public int[] solution(int start_num, int end_num) {
        int length = start_num - end_num + 1;  // 배열의 길이 계산
        int[] answer = new int[length];  // 배열 초기화

        for (int i = 0; i < length; i++) {
            answer[i] = start_num--;  // 배열에 값 채우기
        }

        return answer;
    }
}