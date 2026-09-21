import java.util.*;

class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < prices.length; i++) {

            while (!stack.isEmpty() &&
                   prices[stack.peek()] > prices[i]) {

                int current = stack.pop();
                answer[current] = i - current;
            }

            stack.push(i);
        }

        while (!stack.isEmpty()) {
            int current = stack.pop();
            answer[current] = prices.length - 1 - current;
        }

        return answer;
    }
}