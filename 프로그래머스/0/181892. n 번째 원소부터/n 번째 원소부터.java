class Solution {
    public int[] solution(int[] num_list, int n) {
        // n번째 원소부터 마지막 원소까지의 크기 계산
        int size = num_list.length - (n - 1);
        int[] answer = new int[size];

        // 배열의 n번째 원소부터 마지막 원소까지 복사
        for (int i = 0; i < size; i++) {
            answer[i] = num_list[n - 1 + i];
        }

        return answer;
    }
}