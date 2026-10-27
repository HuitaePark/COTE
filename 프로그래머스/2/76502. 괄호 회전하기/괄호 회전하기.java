import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        List<Character> list = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            list.add(s.charAt(i));
        }

        // 글자 수만큼 반복
        for (int i = 0; i < s.length(); i++) {

            Stack<Character> stack = new Stack<>();
            boolean isCorrect = true;

            for (int j = 0; j < list.size(); j++) {
                char current = list.get(j);

                // 여는 괄호
                if (current == '(' || current == '{' || current == '[') {
                    stack.push(current);
                }
                // 닫는 괄호
                else {
                    if (stack.isEmpty()) {
                        isCorrect = false;
                        break;
                    }

                    char top = stack.pop();

                    if (current == ')' && top != '(' ||
                        current == '}' && top != '{' ||
                        current == ']' && top != '[') {
                        isCorrect = false;
                        break;
                    }
                }
            }

            if (isCorrect && stack.isEmpty()) {
                answer++;
            }

            // 왼쪽으로 한 칸 회전
            list.add(list.remove(0));
        }

        return answer;
    }
}