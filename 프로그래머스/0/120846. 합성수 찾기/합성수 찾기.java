public class Solution {
    public int solution(int n) {
        int compositeCount = 0;

        for (int i = 4; i <= n; i++) {  // 4부터 시작, 1, 2, 3은 합성수가 아님
            int divisorCount = 0;

            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    divisorCount++;
                }
                if (divisorCount > 2) {  // 약수의 개수가 3개 이상인 경우 합성수로 간주
                    compositeCount++;
                    break;
                }
            }
    
        }
        return compositeCount;
    }
}