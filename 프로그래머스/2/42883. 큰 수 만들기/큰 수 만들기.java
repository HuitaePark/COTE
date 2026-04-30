import java.util.*;
import java.util.stream.*;
class Solution {
    public String solution(String number, int k) {
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder(number);
        
        for(int i=0;i<sb.length();i++){
            int current = sb.charAt(i)-'0';
            if(stack.isEmpty()) stack.push(current);
            else{
                while (!stack.isEmpty() && stack.peek() < current && k > 0) {
                    stack.pop();
                    k--;
                }
                stack.push(current);
                }
            }
        
        StringBuilder result = new StringBuilder();
        int targetSize = stack.size() - k; 
        
        // 스택은 원소로 접근 가능
        for (int i = 0; i < targetSize; i++) {
            result.append(stack.get(i));
        }
        
        return result.toString();
    }
}