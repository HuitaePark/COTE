import java.util.*;
class Solution {
    public int[] solution(int n, int[] numlist) {
        ArrayList<Integer> answer = new ArrayList<>();
        
        // numlist의 요소들을 순회하여 n으로 나누어 떨어지는 요소들을 answer에 추가
        for (int i = 0; i < numlist.length; i++) {
            if (numlist[i] % n == 0) {
                answer.add(numlist[i]);
            }
        }
        
        // ArrayList<Integer>를 int[] 배열로 변환
        return answer.stream().mapToInt(i -> i).toArray();
    }
}
