import java.util.*;
class Solution {
    boolean solution(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            char current = s.charAt(i);
            if(stack.isEmpty()) 
                if(current==')')return false;
                else stack.push(current);
            else{
                if(stack.peek()==')' && current==')') return false;
                else if(stack.peek()=='(' && current==')') stack.pop();
                else stack.push(current);
            }
        }
        
        return stack.isEmpty()? true : false;
    }
}